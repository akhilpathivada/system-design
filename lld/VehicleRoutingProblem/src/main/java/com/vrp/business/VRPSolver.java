/**
 * author: akhilpathivada
 * time: 31/05/24 12:46
 */
package com.vrp.business;


import com.graphhopper.jsprit.core.algorithm.VehicleRoutingAlgorithm;
import com.graphhopper.jsprit.core.algorithm.box.Jsprit;
import com.graphhopper.jsprit.core.problem.VehicleRoutingProblem;
import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.request.RoutingProblemRecord;
import com.vrp.response.Routes;
import com.vrp.url.RouteUrlCreator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VRPSolver {

    private static final int MAX_ITERATIONS = 1000;

    private final VehicleRoutingAlgorithm vehicleRoutingAlgorithm;
    private final RouteUrlCreator routeUrlCreator;

    public static VRPSolver from(RoutingProblemRecord RoutingProblemRecord, DistanceMatrix distanceMatrix, RouteUrlCreator routeUrlCreator) {
        var locations = Locations.from(RoutingProblemRecord);
        return new VRPSolver(createAlgorithm(RoutingProblemRecord, distanceMatrix, locations), routeUrlCreator);
    }

    public Routes solve() {
        var solutions = vehicleRoutingAlgorithm.searchSolutions();
        return solutions.stream().findFirst()
                .map(solution -> FromJspritMappers.toRoutes(solution, routeUrlCreator))
                .orElseThrow();
    }

    private static VehicleRoutingAlgorithm createAlgorithm(RoutingProblemRecord problem, DistanceMatrix distanceMatrix, Locations locations) {
        var vehicleRoutingProblemRecord = VehicleRoutingProblemRecord.Builder.newInstance()
                .setFleetSize(VehicleRoutingProblemRecord.FleetSize.FINITE)
                .addAllJobs(problem.shipments().stream().map(shipment -> ToJspritMappers.toShipment(shipment, locations)).toList())
                .addAllVehicles(problem.vehicles().stream().map(vehicle -> ToJspritMappers.toVehicle(vehicle, locations)).toList())
                .setRoutingCost(new DistanceMatrixAdapter(distanceMatrix))
                .build();

        return Jsprit.Builder.newInstance(vehicleRoutingProblemRecord)
                .setProperty(Jsprit.Parameter.ITERATIONS, Integer.toString(MAX_ITERATIONS))
                .buildAlgorithm();
    }
}
