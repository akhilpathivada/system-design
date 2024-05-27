import model.Order;
import model.OrderStatus;
import model.Restaurant;
import model.User;
import model.item.CartItem;
import model.item.MenuItem;
import observer.OrderManager;
import observer.OrderStatusTracker;

import java.util.Arrays;

public class Swiggy {
    public static void main(String[] args) {
        System.out.println("Hello... Welcome to Swiggy!");

        // create users
        User user1 = new User("user1", "John", "password1");
        User user2 = new User("user2", "Alice", "password2");

        // create restaurants
        Restaurant restaurant1 = new Restaurant("restaurant1", "Restaurant 1", "Italian", 4.5);
        Restaurant restaurant2 = new Restaurant("restaurant2", "Restaurant 2", "Indian", 4.2);

        // create menu items
        MenuItem item1 = new MenuItem("item1", "Pizza", 10.99);
        MenuItem item2 = new MenuItem("item2", "Pasta", 8.99);

        // create cart items
        CartItem cartItem1 = new CartItem(item1, 2);
        CartItem cartItem2 = new CartItem(item2, 1);

        // create orders
        Order order1 = new Order("order1", user1, Arrays.asList(cartItem1, cartItem2), "123 Street, City", "Credit Card");
        Order order2 = new Order("order2", user2, Arrays.asList(cartItem1), "456 Street, City", "PayPal");

        // publishers
        OrderManager orderManager1 = new OrderManager(order1);
        OrderManager orderManager2 = new OrderManager(order2);

        // subscribe order status tracker to orders
        OrderStatusTracker statusTracker1 = new OrderStatusTracker(user1);
        OrderStatusTracker statusTracker2 = new OrderStatusTracker(user2);

        orderManager1.subscribeObserver(statusTracker1);
        orderManager2.subscribeObserver(statusTracker2);

        // Update order status
        orderManager1.updateStatus(OrderStatus.PREPARING);
        orderManager2.updateStatus(OrderStatus.OUT_FOR_DELIVERY);
    }
}