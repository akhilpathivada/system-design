/**
 * author: akhilpathivada
 * time: 27/05/24 11:30
 */
package model;

public class Restaurant {

    private String restaurantId;
    private String name;
    private String cuisine;
    private double rating;
    // Other attributes and methods

    public Restaurant(String restaurantId, String name, String cuisine, double rating) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    // Getters and setters
}