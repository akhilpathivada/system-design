package factory.course;

import factory.Course;
import factory.module.DesignPatterns;
import factory.module.Introduction;
import factory.module.SOLIDPrinciples;
import factory.module.Summary;

public class LLD extends Course {

    @Override
    public void createCourse() {
        modules.add(new DesignPatterns());
        modules.add(new SOLIDPrinciples());
        modules.add(new Introduction());
        modules.add(new Summary());
    }
}
