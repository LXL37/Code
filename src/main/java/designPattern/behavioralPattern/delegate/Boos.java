package designPattern.behavioralPattern.delegate;

public class Boos {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
