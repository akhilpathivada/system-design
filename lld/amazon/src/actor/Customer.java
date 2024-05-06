/**
 * author: akhilpathivada
 * time: 06/05/24 08:54
 */
package actor;

import model.Item;
import model.ShoppingCart;
import service.Search;

// customer might be the amazon authenticated user or any guest
public class Customer {

    int id;

    ShoppingCart shoppingCart;

    Search search;

    ShoppingCart getShoppingCart(int customerId) {

    }

    void addItemsToShoppingCart(Item item) {

    }

    void updateItemsFromShoppingCart(Item item) {

    }

    void removeItemsFromShoppingCart(Item item) {

    }
}
