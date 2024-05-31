/**
 * author: akhilpathivada
 * time: 31/05/24 12:55
 */
package com.vrp.business;

import com.vrp.request.Coordinates;
import reactor.util.function.Tuple2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Locations {

//    private final Map<Coordinates, Coordinates> locationMap;
//
//    static Locations from(RoutingProblem problem) {
//        var allCoordinates = problem.getAllCoordinates();
//        return new Locations(
//                IntStream.range(0, allCoordinates.size())
//                        .mapToObj(idx -> new Tuple2<>(allCoordinates.get(idx), idx))
//                        .collect(Collectors.toMap(t -> t._1, t -> toJspritLocation(t._1, t._2)))
//        );
//    }
//
//    Coordinates get(Coordinates coordinates) {
//        return locationMap.get(coordinates);
//    }
//
//    private static Coordinates toJspritLocation(Coordinates coordinates, int index) {
//        return Coordinates.Builder.newInstance()
//                .setId(coordinates.key())
//                .setName(coordinates.key())
//                .setCoordinate(toJspritCoordinate(coordinates))
//                .setIndex(index)
//                .setUserData(coordinates)
//                .build();
//    }
//
//    private static Coordinate toJspritCoordinate(Coordinates coordinates) {
//        return new Coordinate(coordinates.lat().doubleValue(), coordinates.lon().doubleValue());
//    }
}
