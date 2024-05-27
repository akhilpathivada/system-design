/**
 * author: akhilpathivada
 * time: 27/05/24 11:29
 */
package model;


public class User {

    private final String id;

    private final String name;

    private String pwd;


    public User(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    // Getters and setters
    public String getUserName() {
        return name;
    }
}
