/**
 * author: akhilpathivada
 * time: 27/05/24 11:32
 */
package observer;

import model.Order;
import model.OrderStatus;
import model.User;
import model.item.CartItem;

import java.util.ArrayList;
import java.util.List;

public class OrderManager implements Observable {

    private Order order;
    private List<OrderStatusTracker> subscribers;
    // Other attributes and methods

    public OrderManager(Order order) {
        this.order = order;
        this.subscribers = new ArrayList<>();
    }

    // observer pattern for order status change

    @Override
    public void subscribeObserver(OrderStatusTracker orderStatusTracker) {
        subscribers.add(orderStatusTracker);
    }

    @Override
    public void removeObserver(OrderStatusTracker orderStatusTracker) {
        subscribers.remove(orderStatusTracker);
    }


    @Override
    public void updateStatus(OrderStatus orderStatus) {
        subscribers.forEach(orderStatusTracker -> orderStatusTracker.update(orderStatus));
    }
}
