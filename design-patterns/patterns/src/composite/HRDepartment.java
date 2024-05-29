/**
 * author: akhilpathivada
 * time: 29/05/24 16:26
 */
package composite;

public class HRDepartment implements Department {

    String name;

    public HRDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("department name = " + this.name);
    }
}
