/**
 * author: akhilpathivada
 * time: 20/06/24 07:44
 */
package command;

public class SaveFileOperation implements FileOperation {

    File file;

    public SaveFileOperation(File file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.save();
    }
}
