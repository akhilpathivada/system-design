/**
 * author: akhilpathivada
 * time: 30/05/24 18:39
 */
package com.vrp.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    String id;

    String restaurantDetails;

    Coordinates pickupLocation;

    Coordinates deliveryLocation;

    TimeWindow pickupTimeWindow;

    TimeWindow deliveryTimeWindow;

}
