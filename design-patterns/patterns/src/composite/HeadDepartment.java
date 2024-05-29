/**
 * author: akhilpathivada
 * time: 29/05/24 16:24
 */
package composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    String name;

    List<Department> childDepartments;

    public HeadDepartment(String name) {
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
