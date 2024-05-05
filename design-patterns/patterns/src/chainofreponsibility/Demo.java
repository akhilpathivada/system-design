/**
 * author: akhilpathivada
 * time: 05/05/24 07:12
 */
package chainofreponsibility;

public class Demo {

    public static void main(String[] args) {

        ChainCreator chainCreator = new ChainCreator();
        Manager manager = chainCreator.createChain();
        int salaryRequestedByEmployee = 300;
        manager.approveSalary(salaryRequestedByEmployee);
        salaryRequestedByEmployee = 80;
        manager.approveSalary(salaryRequestedByEmployee);
        salaryRequestedByEmployee = 2000;
        manager.approveSalary(salaryRequestedByEmployee);
        salaryRequestedByEmployee = 200;
        manager.approveSalary(salaryRequestedByEmployee);
    }
}
