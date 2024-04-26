package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    protected List<Module> modules = new ArrayList<>();

    public Course() {
        createCourse();
    }

    public List<Module> getModules() {
        return modules;
    }

    public abstract void createCourse();

}
