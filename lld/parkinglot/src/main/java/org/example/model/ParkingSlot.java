/**
 * author: akhilpathivada
 * time: 01/05/24 06:14
 */
package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParkingSlot {

    private final String name;

    private boolean isAvailable;

    private final ParkingSlotType parkingSlotType;

    private Vehicle vehicle;


    public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
        this.name = name;
        this.isAvailable = true;
        this.parkingSlotType = parkingSlotType;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        this.isAvailable = true;
    }

}
