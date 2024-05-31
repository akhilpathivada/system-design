/**
 * author: akhilpathivada
 * time: 31/05/24 08:07
 */
package com.vrp.service;

import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.distancematrix.provider.DistanceProvider;
import com.vrp.request.Coordinates;
import com.vrp.util.Distance;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class DistanceMatrixService {

    private final Scheduler scheduler;
    private final DistanceProvider distanceProvider;

    public DistanceMatrixService(ExecutorService executorService, DistanceProvider distanceProvider) {
        this.scheduler = Schedulers.fromExecutorService(executorService);
        this.distanceProvider = distanceProvider;
    }

    public Mono<DistanceMatrix> createDistanceMatrix(List<Coordinates> Location) {
        return Flux.fromIterable(Location)
                .flatMap(from -> Flux.fromIterable(Location)
                        .flatMap(to -> getEntry(from, to)
                                .map(e -> new Tuple3<>(from, to, e))
                                .subscribeOn(scheduler)
                        ))
                .collectList()
                .map(entries -> createDistanceMatrix(Location, entries));
    }

    private Mono<DistanceMatrix.Entry> getEntry(Coordinates from, Coordinates to) {
        return Mono.fromSupplier(() -> {
            if (from.equals(to)) {
                return new DistanceMatrix.Entry(Duration.ZERO, Distance.ZERO);
            }
            return distanceProvider.fetch(from, to);
        });
    }

    private DistanceMatrix createDistanceMatrix(List<Coordinates> Location, List<Tuple3<Coordinates, Coordinates, DistanceMatrix.Entry>> entries) {
        var map = entries.stream()
                .collect(Collectors.toMap(t -> new Tuple2<>(t._1, t._2), t -> t._3));
        var entriesOrdered = Location.stream()
                .map(from -> Location.stream()
                        .map(to -> map.get(new Tuple2<>(from, to)))
                        .toList())
                .toList();
        return new DistanceMatrix(entriesOrdered);
    }
}
