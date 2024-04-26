package states;

import inventory.Inventory;
import inventory.Product;
import vendingmachine.VendingMachine;

/**
 * Date 26/04/24
 * Time 18:46
 *
 * @author akhilpathivada
 */
public class CoinInsertedState implements State {

    private VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);
    }

    @Override
    public void pressButton(int slotNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(slotNumber);
        if (!vendingMachine.hasSufficientAmount(product.getPrice())) {
            throw new IllegalStateException();
        }
        if (!inventory.checkIfProductAvailable(product.getId())) {
            throw new IllegalStateException();
        }
        vendingMachine.setState(vendingMachine.getDispenseState());
    }

    @Override
    public void dispense(int slotNumber) {
        throw new IllegalStateException();
    }
}
