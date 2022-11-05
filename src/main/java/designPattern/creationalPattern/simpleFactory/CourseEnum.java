package designPattern.creationalPattern.simpleFactory;

/**
 * @author liuxiaolei
 */

public enum CourseEnum {
    /**
     * 课程类别
     */
    JAVA_COURSE("JavaCourse"),
    GO_COURSE("GoCourse")

    ;

    private final String courseName;

    CourseEnum(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
