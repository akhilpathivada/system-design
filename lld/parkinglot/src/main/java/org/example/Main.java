package org.example;

import org.example.model.*;
import org.example.service.ParkingFloor;
import org.example.service.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello parking lot!");

        // initialize the slots
        Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots = new HashMap<>();
        Map<String, ParkingSlot> twoWheelerSlot = new HashMap<>();
        twoWheelerSlot.put("C1", new ParkingSlot("C1", ParkingSlotType.TWO_WHEELER));
        twoWheelerSlot.put("C2", new ParkingSlot("C2", ParkingSlotType.TWO_WHEELER));
        twoWheelerSlot.put("C3", new ParkingSlot("C3", ParkingSlotType.TWO_WHEELER));
        parkingSlots.put(ParkingSlotType.TWO_WHEELER, twoWheelerSlot);

        // initialize the parking floor
        ParkingFloor parkingFloor = new ParkingFloor("B1", parkingSlots);
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(parkingFloor);

        // initialize the parking lot
        ParkingLot parkingLot = ParkingLot.getInstance("AMB Mall Parking", "Gachibowli", parkingFloors);

        // entry of a vehicle
        Vehicle vehicle = new Vehicle(4321, VehicleCategory.TWO_WHEELER);
        Ticket ticket = parkingLot.assignTicket(vehicle);
        System.out.println("assigned the ticket : " + ticket);

        // exit of a vehicle
        // do similar for exit
        // ...
    }
}