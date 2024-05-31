/**
 * author: akhilpathivada
 * time: 31/05/24 08:55
 */
package com.vrp.util;

import java.math.BigDecimal;

public class Distance {

    public static final Distance ZERO = new Distance(BigDecimal.ZERO);

    private final BigDecimal meters;

    public Distance(BigDecimal meters) {
        this.meters = meters;
    }

    public static Distance ofMeters(double value) {
        return new Distance(BigDecimal.valueOf(value));
    }
}
