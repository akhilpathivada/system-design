package factory;

import factory.course.HLD;
import factory.course.LLD;

public class CourseFactory {

    public static Course getCourse(String courseType) {
        switch (courseType) {
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
}
