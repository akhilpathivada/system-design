/**
 * author: akhilpathivada
 * time: 29/05/24 16:24
 */
package composite;

public class FinancialDepartment implements Department {

    String name;

    public FinancialDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("department name = " + this.name);
    }
}
