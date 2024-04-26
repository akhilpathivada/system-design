package factory.course;

import factory.Course;
import factory.module.Introduction;
import factory.module.LoadBalancer;
import factory.module.Memcache;
import factory.module.Summary;

public class HLD extends Course {

    @Override
    public void createCourse() {
        modules.add(new LoadBalancer());
        modules.add(new Memcache());
        modules.add(new Introduction());
        modules.add(new Summary());
    }
}
