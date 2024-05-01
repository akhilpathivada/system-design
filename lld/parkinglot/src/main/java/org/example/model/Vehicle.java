/**
 * author: akhilpathivada
 * time: 01/05/24 06:23
 */
package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {

    private final int vehicleId;

    private final VehicleCategory vehicleCategory;

    public Vehicle(int vehicleId, VehicleCategory vehicleCategory) {
        this.vehicleId = vehicleId;
        this.vehicleCategory = vehicleCategory;
    }
}
