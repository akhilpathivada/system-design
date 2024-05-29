/**
 * author: akhilpathivada
 * time: 29/05/24 15:23
 */
package model;

public class File {

    private String name;
    private byte[] data;
    private String owner;
    // Other attributes and methods

    public File(String name, byte[] data, String owner) {
        this.name = name;
        this.data = data;
        this.owner = owner;
    }

    // Getters and setters

}
