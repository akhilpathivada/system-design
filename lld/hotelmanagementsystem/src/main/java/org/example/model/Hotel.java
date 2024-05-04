/**
 * author: akhilpathivada
 * time: 04/05/24 20:15
 */
package org.example.model;

import java.util.List;

public class Hotel {

    private final int id;

    private final String name;

    private final Location location;

    private final List<Room> rooms;

    public Hotel(int id, String name, Location location, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rooms = rooms;
    }
}
