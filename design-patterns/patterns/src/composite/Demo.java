/**
 * author: akhilpathivada
 * time: 29/05/24 16:24
 */
package composite;

public class Demo {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment("Sales department");
        Department financialDepartment = new FinancialDepartment("Financial department");
        Department hrDepartment = new HRDepartment("HR Department");

        HeadDepartment headDepartment = new HeadDepartment("Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(hrDepartment);

        headDepartment.printDepartmentName();
    }
}
