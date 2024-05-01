/**
 * author: akhilpathivada
 * time: 01/05/24 06:37
 */
package org.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Ticket {

    private final int ticketNumber;

    private final double price;

    private final long startTime;

    private final long endTime;

    private final Vehicle vehicle;

    private final ParkingSlot parkingSlot;

    public static Ticket createTicket(ParkingSlot parkingSlot, Vehicle vehicle) {
        return Ticket.builder()
                .ticketNumber((int) (vehicle.getVehicleId() + System.currentTimeMillis()))
                .startTime(System.currentTimeMillis())
                .parkingSlot(parkingSlot)
                .vehicle(vehicle)
                .build();
    }
}
