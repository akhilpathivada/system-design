package observer;

import model.Order;
import model.OrderStatus;

public interface Observer {

    public void update(OrderStatus orderStatus);
}
