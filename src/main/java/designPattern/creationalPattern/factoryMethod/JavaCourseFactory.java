package designPattern.creationalPattern.factoryMethod;

import designPattern.creationalPattern.simpleFactory.ICourse;
import designPattern.creationalPattern.simpleFactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
