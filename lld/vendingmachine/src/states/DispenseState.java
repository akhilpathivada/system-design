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
public class DispenseState implements State {

    private VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("product getting dispensed");
    }

    @Override
    public void pressButton(int slotNumber) {
        throw new IllegalStateException("product getting dispensed");
    }

    @Override
    public void dispense(int slotNumber) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(slotNumber);
        inventory.deductProductCount(product.getId());
        vendingMachine.setState(vendingMachine.getNoCoinInsertedState());
    }
}
