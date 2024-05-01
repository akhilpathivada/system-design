/**
 * author: akhilpathivada
 * time: 01/05/24 06:13
 */
package org.example.service;

import org.example.model.*;

import java.util.List;
import java.util.Map;

public class ParkingLot {

    private static ParkingLot instance = null;

    private final String name;

    private final String address;

    private final List<ParkingFloor> parkingFloors;

    public ParkingLot(String name, String address, List<ParkingFloor> parkingFloors) {
        this.name = name;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getInstance(String name, String address, List<ParkingFloor> parkingFloors) {
        if (instance == null) {
            instance = new ParkingLot(name, address, parkingFloors);
        }
        return instance;
    }

    public void addFloors(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
        ParkingFloor parkingFloor = new ParkingFloor(name, parkingSlots);
        parkingFloors.add(parkingFloor);
    }

    public void removeFloors(ParkingFloor parkingFloor) {
        parkingFloors.remove(parkingFloor);
    }

    public Ticket assignTicket(Vehicle vehicle) { // during the entry
        ParkingSlot parkingSlot = getParkingSlotForVehicleAndPark(vehicle);
        if (parkingSlot == null) {
            return null;
        }
        Ticket parkingTicket = createTicketForSlot(parkingSlot, vehicle);
        // we can maintain a db to persist all the tickets
        return parkingTicket;
    }

    public double scanAndPay(Ticket ticket) {
        long endTime = System.currentTimeMillis();
        long duration = endTime - ticket.getStartTime();
        double price = ticket.getParkingSlot().getParkingSlotType().getPriceForParking(duration);
        return price;
    }

    public ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {
        ParkingSlot parkingSlot = null;
        for (ParkingFloor parkingFloor : parkingFloors) {
            parkingSlot = parkingFloor.getRelevantSlotForVehicleAndPark(vehicle);
            if (parkingSlot != null) {
                break;
            }
        }
        return parkingSlot;
    }

    public Ticket createTicketForSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        return Ticket.createTicket(parkingSlot, vehicle);
    }
}
