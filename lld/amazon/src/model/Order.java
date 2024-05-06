/**
 * author: akhilpathivada
 * time: 06/05/24 09:10
 */
package model;

import actor.Buyer;

import java.util.Date;
import java.util.List;

public class Order {

    int orderId;

    List<Item> orderItems;

    double orderValue;

    Buyer buyer;

    Date orderedDate;

    List<OrderLog> orderLogs;

    public OrderStatus placeOrder() {

    }

    public OrderStatus trackOrder() {

    }

    public PaymentStatus makePayment(PaymentType paymentType) {

    }

}
