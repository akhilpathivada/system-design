package factory;

import factory.course.HLD;
import factory.course.LLD;

public class CourseFactory {

    public static Course getCourse(String courseType) {
        return switch (courseType) {
            case "LLD" -> new LLD();
            case "HLD" -> new HLD();
            default -> null;
        };
    }
}
