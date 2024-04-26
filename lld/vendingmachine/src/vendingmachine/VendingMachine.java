package vendingmachine;

import inventory.Inventory;
import inventory.Product;
import states.CoinInsertedState;
import states.DispenseState;
import states.NoCoinInsertedState;
import states.State;

/**
 * Date 26/04/24
 * Time 18:50
 *
 * @author akhilpathivada
 */
public class VendingMachine {

    private static int SLOTS = 2;

    private State currentState;

    private NoCoinInsertedState noCoinInsertedState;

    private CoinInsertedState coinInsertedState;

    private DispenseState dispenseState;

    private Inventory inventory;

    private double amount;

    public VendingMachine() {
        noCoinInsertedState = new NoCoinInsertedState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);
        currentState = noCoinInsertedState;
        amount = 0.0;
        inventory = new Inventory(SLOTS);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void insertCoin(double amount) {
        noCoinInsertedState.insertCoin(amount);
    }

    public void pressButton(int slotNumber) {
        currentState.pressButton(slotNumber);
        currentState.dispense(slotNumber);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addProduct(Product product) throws Exception {
        inventory.addProduct(product);
    }

    public boolean hasSufficientAmount(double expectedAmount) {
        return this.amount >= expectedAmount;
    }

    public double getAmount() {
        return amount;
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

}
