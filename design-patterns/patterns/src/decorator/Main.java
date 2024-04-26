package decorator;

/**
 * Date 26/04/24
 * Time 14:16
 *
 * @author akhilpathivada
 */
public class Main {

    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + ", " + burger.getCost());

        burger = new ExtraCheeseBurger(burger);
        System.out.println(burger.getDescription() + ", " + burger.getCost());

        burger = new ExtraPepperBurger(burger);
        System.out.println(burger.getDescription() + ", " + burger.getCost());
    }
}
