/**
 * author: akhilpathivada
 * time: 27/05/24 11:39
 */
package observer;

import model.Order;
import model.OrderStatus;

public interface Observable {

    public void subscribeObserver(OrderStatusTracker orderStatusTracker);

    public void removeObserver(OrderStatusTracker orderStatusTracker);

    public void updateStatus(OrderStatus orderStatus);
}
