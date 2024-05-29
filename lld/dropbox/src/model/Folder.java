/**
 * author: akhilpathivada
 * time: 29/05/24 15:24
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<File> files;
    private List<Folder> folders;
    // Other attributes and methods

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void addFolder(Folder folder) {
        folders.add(folder);
    }

    public void removeFolder(Folder folder) {
        folders.remove(folder);
    }

    // Getters and setters
}
