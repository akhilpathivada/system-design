/**
 * author: akhilpathivada
 * time: 30/05/24 18:36
 */
package com.vrp.request;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class RoutingProblemRecord {

    List<Vehicle> vehicles;

    List<Order> orders;

    public List<Coordinates> getAllCoordinates() {
        return Stream.concat(
                vehicles.stream().flatMap(vehicle -> Stream.of(vehicle.getStartLocation(), vehicle.getEndLocation())),
                orders.stream().flatMap(order -> Stream.of(order.getPickupLocation(), order.getDeliveryLocation()))
        ).distinct().sorted(Comparator.comparing(Coordinates::key)).toList();
    }
}
