/**
 * author: akhilpathivada
 * time: 31/05/24 08:07
 */
package com.vrp.distancematrix;

import com.vrp.util.Distance;

import java.time.Duration;
import java.util.List;

public class DistanceMatrix {

    public static final class Entry {

        Duration time;

        Distance distance;

        public Entry(Duration time, Distance distance) {
            this.time = time;
            this.distance = distance;
        }
    }

    public List<List<Entry>> entries;

    public DistanceMatrix(List<List<Entry>> entries) {
        this.entries = entries;
    }
}
