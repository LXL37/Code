package designPattern.creationalPattern.abstractFactory;

public class JavaCourseFactory extends CourseFactory {
    @Override
    INote createNode() {
        return new JavaNote();
    }

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }
}
