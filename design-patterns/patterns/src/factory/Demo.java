package factory;

public class Demo {

    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");
        assert hldCourse != null;
        System.out.println("HLD Course Modules: " + hldCourse.getModules());
        assert lldCourse != null;
        System.out.println("HLD Course Modules: " + lldCourse.getModules());
    }

}
