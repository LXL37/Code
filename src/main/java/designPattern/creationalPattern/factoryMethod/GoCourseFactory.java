package designPattern.creationalPattern.factoryMethod;

import designPattern.creationalPattern.simpleFactory.GoCourse;
import designPattern.creationalPattern.simpleFactory.ICourse;

public class GoCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new GoCourse();
    }
}
