/**
 * author: akhilpathivada
 * time: 29/05/24 15:24
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private List<File> files;
    private List<Folder> folders;
    // Other attributes and methods

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public void uploadFile(String name, byte[] data) {
        File file = new File(name, data, username);
        files.add(file);
    }

    public void createFolder(String name) {
        Folder folder = new Folder(name);
        folders.add(folder);
    }

    // Getters and setters

    public List<File> getFiles() {
        return files;
    }
}
