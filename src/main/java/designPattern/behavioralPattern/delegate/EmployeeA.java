package designPattern.behavioralPattern.delegate;

public class EmployeeA implements IEmployee{
    protected String goodAt="编程";
    @Override
    public void doing(String task) {
        System.out.println("员工A擅长"+goodAt+"，开始做:"+task);
    }
}
