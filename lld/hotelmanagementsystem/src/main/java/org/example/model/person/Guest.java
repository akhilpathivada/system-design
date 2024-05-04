/**
 * author: akhilpathivada
 * time: 04/05/24 20:34
 */
package org.example.model.person;

import org.example.model.Room;
import org.example.model.actions.Booking;
import org.example.model.actions.Cancel;
import org.example.model.actions.Search;

import java.util.List;

public class Guest extends Person {

    Search search;

    Booking booking;

    Cancel cancel;

    public List<Room> getAvailableRooms() {
        // write acutual logic to get available rooms
        return null;
    }
}
