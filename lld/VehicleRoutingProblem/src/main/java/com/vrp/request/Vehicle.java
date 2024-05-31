/**
 * author: akhilpathivada
 * time: 30/05/24 18:37
 */
package com.vrp.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {

    String id;

    Coordinates startLocation;

    Coordinates endLocation;

    TimeWindow timeWindow;

}
