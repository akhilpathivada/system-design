/**
 * author: akhilpathivada
 * time: 31/05/24 12:49
 */
package com.vrp.url;

import com.vrp.request.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class RouteUrlCreator {

    public String create(List<Coordinates> locations) {
        var uniqueStops = new ArrayList<String>();
        for (var location : locations) {
            var key = location.key();
            if (!uniqueStops.isEmpty() && uniqueStops.get(uniqueStops.size() - 1).equals(key)) {
                continue;
            }
            uniqueStops.add(key);
        }
        var query = String.join("/", uniqueStops);
        return "https://www.google.com/maps/dir/" + query;
    }
}
