/**
 * author: akhilpathivada
 * time: 06/05/24 08:02
 */
package model;

import java.util.List;
import java.util.Map;

public class Movie {

    String name;

    int durationInMins;

    String genre;

    Date releaseDate;

    // list down all the shows of a move in a city
    Map<String, List<Show>> cityToShowsMap;
}
