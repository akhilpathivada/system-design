/**
 * author: akhilpathivada
 * time: 19/06/24 15:04
 */
package service;

import model.Order;
import model.User;

public class OrderManager {


    OrderValidator orderValidator;

    OrderExecutioner orderExecutioner;

    void placeOrder(String userId, Order order) {
        if (orderValidator.isValidOrder(order)) {
            orderExecutioner.sendOrderToExchangeConnector(order);
        }
    }
}
