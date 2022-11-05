package designPattern.creationalPattern.factoryMethod;

public class test {
    public static void main(String[] args) {
        ICourseFactory courseFactoryJava=new JavaCourseFactory();
        ICourseFactory courseFactoryGo=new GoCourseFactory();
        courseFactoryGo.createCourse().record();
        courseFactoryJava.createCourse().record();
    }
}
