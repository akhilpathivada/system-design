import model.File;
import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * author: akhilpathivada
 * time: 29/05/24 15:31
 */

public class FileProxy {

    private File file;
    private List<User> sharedWithUsers;
    // Other attributes and methods

    public FileProxy(File file) {
        this.file = file;
        this.sharedWithUsers = new ArrayList<>();
    }

    public void shareFileWithUser(User user) {
        sharedWithUsers.add(user);
    }

    public void revokeFileAccessForUser(User user) {
        sharedWithUsers.remove(user);
    }
    // Other operations, such as read, write, and delete, can be implemented here
}
