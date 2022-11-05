package designPattern.creationalPattern.builder;

import lombok.Data;

@Data
public class Course {
    private String name;
    private String ppt;
    private String code;


    public static class CourseBuilder{
        private Course course=new Course();
        public CourseBuilder addName(String name){
            course.setName(name);
            return this;
        }
        public CourseBuilder addPpt(String ppt){
            course.setPpt(ppt);
            return this;
        }
        public CourseBuilder addCode(String code){
            course.setCode(code);
            return this;
        }
        public Course build(){
            return this.course;
        }



    }

    public static void main(String[] args) {
        Course course=new Course.CourseBuilder()
                .addCode("code1")
                .addName("java")
                .addPpt("ppt")
                .build();
        System.out.println(course);
    }
}
