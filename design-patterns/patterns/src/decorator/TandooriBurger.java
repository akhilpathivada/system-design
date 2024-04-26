package decorator;

/**
 * Date 26/04/24
 * Time 14:06
 *
 * @author akhilpathivada
 */
public class TandooriBurger extends Burger {

    @Override
    public String getDescription() {
        return "Tandoori Burger";
    }

    @Override
    public double getCost() {
        return 110.0;
    }

}
