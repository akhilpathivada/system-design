/**
 * author: akhilpathivada
 * time: 27/05/24 11:32
 */
package model.item;

public class CartItem {

    private MenuItem menuItem;
    private int quantity;
    // Other attributes and methods

    public CartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // Getters and setters
}
