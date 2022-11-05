package designPattern.structuralPattern.bridge;

public class Client {
    public static void main(String[] args) {

        IMessage email=new EmailMessage();
        IMessage sms=new SmsMessage();

        AbstractMessage normal=new AbstractMessage(email);
        normal.sendMessage("你好","lxl");
        AbstractMessage urgency=new AbstractMessage(sms);
        urgency.sendMessage("吃了吗","me");

    }
}
