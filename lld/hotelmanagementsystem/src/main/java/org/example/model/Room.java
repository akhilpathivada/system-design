/**
 * author: akhilpathivada
 * time: 04/05/24 20:16
 */
package org.example.model;

import java.util.List;

public class Room {

    private final int roomNumber;

    private final int floorNumber;

    private final RoomType roomType;

    private final double bookingPrice;

    private final List<HouseKeepingLog> houseKeepingLogs;

    public Room(int roomNumber, int floorNumber, RoomType roomType, double bookingPrice, List<HouseKeepingLog> houseKeepingLogs) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.roomType = roomType;
        this.bookingPrice = bookingPrice;
        this.houseKeepingLogs = houseKeepingLogs;
    }
}
