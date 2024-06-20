/**
 * author: akhilpathivada
 * time: 20/06/24 07:45
 */
package command;

public class OpenFileOperation implements FileOperation {

    private File file;

    public OpenFileOperation(File file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.open();
    }
}
