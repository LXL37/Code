package designPattern.creationalPattern.simpleFactory;

public class CourseClient {
    public static void main(String[] args) {

        CourseSimpleFactory courseSimpleFactory = new CourseSimpleFactory();
        courseSimpleFactory.createCourse(JavaCourse.class).record();
        courseSimpleFactory.createCourse(GoCourse.class).record();


    }
}
