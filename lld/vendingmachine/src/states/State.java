package states;

/**
 * Date 26/04/24
 * Time 18:47
 *
 * @author akhilpathivada
 */

// 3 possible states: NoCoinInsertedState -> CoinInsertedState -> DispenseState -> NoCoinInsertedState
public interface State {

    public void insertCoin(double amount);

    public void pressButton(int slotNumber);

    public void dispense(int slotNumber);
}
