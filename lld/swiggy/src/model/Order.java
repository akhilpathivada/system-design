/**
 * author: akhilpathivada
 * time: 27/05/24 11:47
 */
package model;

import model.item.CartItem;

import java.util.List;

public class Order {

    private String orderId;
    private User user;
    private List<CartItem> cartItems;
    private String deliveryAddress;
    private String paymentMethod;
    private OrderStatus orderStatus;

    // Other attributes and methods

    public Order(String orderId, User user, List<CartItem> cartItems, String deliveryAddress, String paymentMethod) {
        this.orderId = orderId;
        this.user = user;
        this.cartItems = cartItems;
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
        this.orderStatus = OrderStatus.RECEIVED;
    }

    // Getters and setters
    public String getStatus() {
        return orderStatus.toString();
    }
    // ...
}
