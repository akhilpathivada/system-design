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
public class NoCoinInsertedState implements State {

    private VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(amount);
        vendingMachine.setState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(int slotNumber) {
        throw new IllegalStateException("no coin is inserted");
    }

    @Override
    public void dispense(int slotNumber) {
        throw new IllegalStateException("no coin is inserted");
    }
}
