/**
 * author: akhilpathivada
 * time: 31/05/24 07:51
 */
package com.vrp.service;


import com.vrp.business.VRPSolver;
import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.request.RoutingProblemRecord;
import com.vrp.response.Route;
import com.vrp.response.Routes;
import com.vrp.url.RouteUrlCreator;
import reactor.core.publisher.Mono;

@Singleton
public class VRPSolverService {

    private final RouteUrlCreator routeUrlCreator;

    public VRPSolverService(RouteUrlCreator routeUrlCreator) {
        this.routeUrlCreator = routeUrlCreator;
    }

    public Mono<Routes> solve(RoutingProblemRecord routingProblem, DistanceMatrix distanceMatrix) {
        return Mono.just(routingProblem)
                .map(ignored -> VRPSolver.from(routingProblem, distanceMatrix, routeUrlCreator).solve());
        return null;
    }
}
