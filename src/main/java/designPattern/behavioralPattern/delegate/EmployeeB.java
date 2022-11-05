package designPattern.behavioralPattern.delegate;

public class EmployeeB implements IEmployee{
    protected String goodAt="学习";
    @Override
    public void doing(String task) {
        System.out.println("员工b,擅长:"+goodAt+",开始做"+task);
    }
}
