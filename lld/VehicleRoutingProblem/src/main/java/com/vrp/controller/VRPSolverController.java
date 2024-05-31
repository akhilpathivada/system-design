/**
 * author: akhilpathivada
 * time: 30/05/24 18:33
 */
package com.vrp.controller;

import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.request.RoutingProblemRecord;
import com.vrp.response.Route;
import com.vrp.service.DistanceMatrixService;
import com.vrp.service.VRPSolverService;
import lombok.NonNull;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("/find-route")
public class VRPSolverController {

    private final DistanceMatrixService distanceMatrixService;

    private final VRPSolverService vrpSolverService;

    public VRPSolverController(DistanceMatrixService distanceMatrixService, VRPSolverService vrpSolverService) {
        this.distanceMatrixService = distanceMatrixService;
        this.vrpSolverService = vrpSolverService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<Route> solve(RoutingProblemRecord routingProblemRecord) {
//        return Mono.just(routingProblem)
//                .flatMap(ignored -> distanceMatrixService.createDistanceMatrix(routingProblem.getAllCoordinates()))
//                .flatMap(dm -> routingProblemSolverService.solve(routingProblem, dm))
//                .subscribeOn(scheduler);
//        return vrpSolverService.solve(routingProblemRecord,
//                distanceMatrixService.createDistanceMatrix(routingProblemRecord.getAllCoordinates()));
        return null;
    }
}
