package decorator;

/**
 * Date 26/04/24
 * Time 14:13
 *
 * @author akhilpathivada
 */
public class ExtraCheeseBurger extends BurgerDecorator {

    private final Burger burger;

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "with extra cheese ";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 21.0;
    }
}
