package designPattern.behavioralPattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{
    private Map<String,IEmployee> employeeMap=new HashMap<>();

    public Leader(){
        employeeMap.put("爬虫",new EmployeeA());
        employeeMap.put("海报",new EmployeeB());
    }
    @Override
    public void doing(String task) {
        if (!employeeMap.containsKey(task)){
            System.out.println("超出能力范围！");
            return;
        }
        employeeMap.get(task).doing(task);
    }
}
