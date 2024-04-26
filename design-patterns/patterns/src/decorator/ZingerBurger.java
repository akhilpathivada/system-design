package decorator;

/**
 * Date 26/04/24
 * Time 14:04
 *
 * @author akhilpathivada
 */
public class ZingerBurger extends Burger {

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 150.0;
    }

}
