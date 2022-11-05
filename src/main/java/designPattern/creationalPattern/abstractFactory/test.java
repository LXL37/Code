package designPattern.creationalPattern.abstractFactory;

public class test {
    public static void main(String[] args) {
        CourseFactory java=new JavaCourseFactory();
        java.createNode().edit();
        java.createVideo().record();
    }
}
