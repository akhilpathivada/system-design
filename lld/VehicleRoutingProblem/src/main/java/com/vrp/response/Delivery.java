/**
 * author: akhilpathivada
 * time: 31/05/24 07:40
 */
package com.vrp.response;

import com.vrp.request.Coordinates;

import java.time.OffsetDateTime;

public class Delivery {

    String shipmentId;

    DeliveryStatus type;

    Coordinates location;

    OffsetDateTime arrivalTime;

    OffsetDateTime departureTime;

}
