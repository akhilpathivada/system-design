/**
 * author: akhilpathivada
 * time: 04/05/24 20:51
 */
package org.example.model;

import org.example.model.person.Guest;

import java.util.Date;
import java.util.List;

public class RoomBookingInfo {

    String bookingId;

    Date startDate;

    BookingStatus bookingStatus;

    List<Guest> guests;

    List<Room> rooms;

    BaseRoomCharge totalRoomCharges;


}
