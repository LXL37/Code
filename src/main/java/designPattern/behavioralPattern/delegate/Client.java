package designPattern.behavioralPattern.delegate;

public class Client {
    public static void main(String[] args) {
        Boos boos=new Boos();
        boos.command("拆螺丝",new Leader());
        boos.command("爬虫",new Leader());

    }
}
