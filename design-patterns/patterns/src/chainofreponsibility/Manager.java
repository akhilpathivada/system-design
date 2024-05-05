/**
 * author: akhilpathivada
 * time: 05/05/24 06:55
 *
 * https://www.youtube.com/watch?v=dKzZcKcPXvM
 *
 */
package chainofreponsibility;

public abstract class Manager {

    protected Manager manager;

    String managerName;

    int approvalLimit;

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void approveSalary(int employeeSalary) {
        if (employeeSalary <= this.approvalLimit) {
            processSalary(employeeSalary);
        } else if (this.manager != null){
            this.manager.approveSalary(employeeSalary);
        } else {
            System.out.println("Can't extend the offer");
        }
    }

    protected abstract void processSalary(int employeeSalary);
}
