/**
 * author: akhilpathivada
 * time: 05/05/24 07:02
 */
package chainofreponsibility;

public class HiringManager extends Manager {

    public HiringManager(String managerName, int approvalLimit) {
        this.managerName = managerName;
        this.approvalLimit = approvalLimit;
    }

    @Override
    public void processSalary(int employeeSalary) {
        System.out.println(this.managerName + " has approved salary at level-1");
    }
}
