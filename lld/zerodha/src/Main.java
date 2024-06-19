import model.Exchange;
import model.Order;
import model.Stock;
import model.User;
import service.OrderManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello zerodha !");


        User user = new User();

        Stock stock = new Stock("", 0L, Exchange.BSE);

        // create order
        // Order order = new Order(user, stock, ....);

        // start from order manager
        OrderManager orderManager = new OrderManager();
    }
}