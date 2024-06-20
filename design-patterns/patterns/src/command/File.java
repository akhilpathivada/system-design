/**
 * author: akhilpathivada
 * time: 20/06/24 07:45
 */
package command;

public class File {

    String name;

    public File(String name) {
        this.name = name;
    }

    public String open() {
        return "opening file " + name;
    }

    public String save() {
        return "saving file " + name;
    }
}
