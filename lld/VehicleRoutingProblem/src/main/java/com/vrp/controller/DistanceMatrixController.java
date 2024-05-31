/**
 * author: akhilpathivada
 * time: 31/05/24 12:27
 */
package com.vrp.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.request.Coordinates;
import com.vrp.service.DistanceMatrixService;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.List;
import java.util.concurrent.ExecutorService;

@Controller("/distance-matrix")
public class DistanceMatrixController {

    private final Scheduler scheduler;
    private final DistanceMatrixService distanceMatrixService;

    public DistanceMatrixController(ExecutorService executorService, DistanceMatrixService distanceMatrixService) {
        this.scheduler = Schedulers.fromExecutorService(executorService);
        this.distanceMatrixService = distanceMatrixService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Publisher<DistanceMatrix> byName(@JsonFormat List<Coordinates> coordinates) {
        return distanceMatrixService.createDistanceMatrix(coordinates)
                .subscribeOn(scheduler);
    }
}