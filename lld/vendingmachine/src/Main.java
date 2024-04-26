import inventory.Product;
import vendingmachine.VendingMachine;

/**
 * Date 26/04/24
 * Time 17:43
 *
 * @author akhilpathivada
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Vending Machine!");
        VendingMachine vendingMachine = new VendingMachine();

        Product biscuits = new Product(1, "biscuits", 30.0);

        // insert 3 biscuits
        for (int i = 0; i < 3; ++i) {
            vendingMachine.addProduct(biscuits);
        }

        Product chocolates = new Product(1, "chocolates", 10.0);
        // insert 3 chocolates
        for (int i = 0; i < 3; ++i) {
            vendingMachine.addProduct(chocolates);
        }

        vendingMachine.insertCoin(10.0);
        vendingMachine.insertCoin(3.0);
        vendingMachine.pressButton(1);
    }
}