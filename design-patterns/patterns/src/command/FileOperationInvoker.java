/**
 * author: akhilpathivada
 * time: 20/06/24 07:52
 */
package command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationInvoker {

    private final List<FileOperation> fileOperations = new ArrayList<>();

    public String executeOperation(FileOperation fileOperation) {
        fileOperations.add(fileOperation); // better to store, so that would be useful for undo/redo
        return fileOperation.execute();
    }
}
