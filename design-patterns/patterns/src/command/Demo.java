/**
 * author: akhilpathivada
 * time: 20/06/24 07:53
 */
package command;

public class Demo {

    public static void main(String[] args) {
        FileOperationInvoker fileOperationInvoker = new FileOperationInvoker();
        fileOperationInvoker.executeOperation(new OpenFileOperation(new File("file1.txt")));
        fileOperationInvoker.executeOperation(new SaveFileOperation(new File("file2.txt")));
    }
}
