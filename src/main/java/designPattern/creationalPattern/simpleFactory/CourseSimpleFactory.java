package designPattern.creationalPattern.simpleFactory;

public class CourseSimpleFactory {

     ICourse createCourse(Class<? extends ICourse> iCourseClass){


        try {
            return iCourseClass.newInstance();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
