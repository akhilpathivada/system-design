/**
 * author: akhilpathivada
 * time: 06/05/24 06:22
 */
package solid.lsp.inefficient;

public class Main {

    public static void main(String[] args) {
        Green green = new Blue();
        green.getColor();
    }
}
