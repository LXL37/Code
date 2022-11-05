package designPattern.creationalPattern.abstractFactory;

public class GoCourseFactory extends CourseFactory{
    @Override
    INote createNode() {
        return new GoNote();
    }

    @Override
    IVideo createVideo() {
        return new GoVideo();
    }
}
