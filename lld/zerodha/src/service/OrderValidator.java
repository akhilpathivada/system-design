/**
 * author: akhilpathivada
 * time: 19/06/24 14:59
 */
package service;

import model.Order;

public class OrderValidator {

    boolean isValidOrder(Order order) {
        // do some validations like
        // 1. is the order type is BUY : check he has enough funds
        // 2. is the order type is SELL : check he has enough stocks
        return true;
    }
}
