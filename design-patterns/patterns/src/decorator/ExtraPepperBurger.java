package decorator;

/**
 * Date 26/04/24
 * Time 14:18
 *
 * @author akhilpathivada
 */
public class ExtraPepperBurger extends BurgerDecorator {

    private final Burger burger;

    public ExtraPepperBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "with extra pepper ";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 34.0;
    }
}
