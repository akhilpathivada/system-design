/**
 * author: akhilpathivada
 * time: 01/05/24 06:16
 */
package org.example.model;

public enum ParkingSlotType {

    TWO_WHEELER {
        public double getPriceForParking(long duration) {
            return duration * 0.05;
        }
    },

    COMPACT {
        public double getPriceForParking(long duration) {
            return duration * 0.05;
        }
    },

    MEDIUM {
        public double getPriceForParking(long duration) {
            return duration * 0.05;
        }
    },

    LARGE {
        public double getPriceForParking(long duration) {
            return duration * 0.05;
        }
    };

    public abstract double getPriceForParking(long duration);
}
