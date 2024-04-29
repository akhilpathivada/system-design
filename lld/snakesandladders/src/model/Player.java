package model;

/**
 * Date 29/04/24
 * Time 08:25
 *
 * @author akhilpathivada
 */
public class Player {

    private final int id;

    private final String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
