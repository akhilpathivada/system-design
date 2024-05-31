/**
 * author: akhilpathivada
 * time: 30/05/24 18:38
 */
package com.vrp.request;

import lombok.Builder;

import java.util.Locale;

@Builder
public class Coordinates {

    String latitude;

    String longitude;

    public String key() {
        return String.format(Locale.ENGLISH, "%s,%s", latitude, longitude);
    }
}
