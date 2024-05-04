/**
 * author: akhilpathivada
 * time: 04/05/24 20:21
 */
package org.example.model;

import org.example.model.person.HouseKeeper;

import java.util.Date;

public class HouseKeepingLog {

    private final Date startDate;

    private final int duration;

    private final HouseKeeper houseKeeper;

    public HouseKeepingLog(Date startDate, int duration, HouseKeeper houseKeeper) {
        this.startDate = startDate;
        this.duration = duration;
        this.houseKeeper = houseKeeper;
    }

    public void addRoom(Room room) {

    }
}
