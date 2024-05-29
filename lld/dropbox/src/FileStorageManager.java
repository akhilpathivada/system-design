import model.File;
import model.Folder;

import java.util.ArrayList;
import java.util.List;

/**
 * author: akhilpathivada
 * time: 29/05/24 15:30
 */

// FileStorageManager singleton class
public class FileStorageManager {

    private static FileStorageManager instance;
    private List<File> files;
    private List<Folder> folders;
    // Other attributes and methods

    private FileStorageManager() {
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public static FileStorageManager getInstance() {
        if (instance == null) {
            instance = new FileStorageManager();
        }
        return instance;
    }

    public void uploadFile(File file) {
        files.add(file);
    }

    public void deleteFile(File file) {
        files.remove(file);
    }

    public void createFolder(Folder folder) {
        folders.add(folder);
    }

    public void deleteFolder(Folder folder) {
        folders.remove(folder);
    }

    // Getters and setters
}
