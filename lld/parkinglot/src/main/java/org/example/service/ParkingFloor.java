/**
 * author: akhilpathivada
 * time: 01/05/24 06:14
 */
package org.example.service;

import org.example.model.ParkingSlot;
import org.example.model.ParkingSlotType;
import org.example.model.Vehicle;
import org.example.model.VehicleCategory;

import java.util.Map;

public class ParkingFloor {

    private final String floorNumber;

    private final Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots;

    public ParkingFloor(String floorNumber, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
        this.floorNumber = floorNumber;
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getRelevantSlotForVehicleAndPark(Vehicle vehicle) {
        VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
        ParkingSlotType parkingSlotType = pickCorrectSlot(vehicleCategory);
        Map<String, ParkingSlot> relevantParkingSlot = parkingSlots.get(parkingSlotType);
        ParkingSlot parkingSlot = null;
        for (Map.Entry<String, ParkingSlot> entry : relevantParkingSlot.entrySet()) {
            if (entry.getValue().isAvailable()) {
                parkingSlot = entry.getValue();
                parkingSlot.addVehicle(vehicle);
                break;
            }
        }
        return parkingSlot;
    }

    public ParkingSlotType pickCorrectSlot(VehicleCategory vehicleCategory) {
        switch (vehicleCategory){
            case TWO_WHEELER:
                return ParkingSlotType.TWO_WHEELER;
            case SUV:
                return ParkingSlotType.LARGE;
        }
        return null;
    }

}
