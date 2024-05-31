/**
 * author: akhilpathivada
 * time: 31/05/24 12:18
 */
package com.vrp.distancematrix.provider;

import com.vrp.distancematrix.DistanceMatrix;
import com.vrp.request.Coordinates;

public interface DistanceProvider {

    DistanceMatrix.Entry fetch(Coordinates from, Coordinates to);
}
