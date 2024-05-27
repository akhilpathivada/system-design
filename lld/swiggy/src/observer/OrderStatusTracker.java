/**
 * author: akhilpathivada
 * time: 27/05/24 11:34
 */
package observer;

import model.Order;
import model.OrderStatus;
import model.User;

public class OrderStatusTracker implements Observer {

    private User user;

    public OrderStatusTracker(User user) {
        this.user = user;
    }

    @Override
    public void update(OrderStatus orderStatus) {
        // Update order status for the user
        System.out.println("Order status updated for user " + user.getUserName() + ": " + orderStatus.toString());
    }
}
