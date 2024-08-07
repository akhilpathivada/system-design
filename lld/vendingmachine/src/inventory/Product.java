package inventory;

/**
 * Date 26/04/24
 * Time 18:21
 *
 * @author akhilpathivada
 */
public class Product {

    private final int id;

    private final String name;

    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
