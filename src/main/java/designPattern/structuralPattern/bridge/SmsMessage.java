package designPattern.structuralPattern.bridge;

/**
 * @author liuxiaolei
 * 短信消息
 */
public class SmsMessage implements IMessage{
    @Override
    public void send(String msg, String toUser) {
        System.out.println("发送短信:"+msg+",To:"+toUser);
    }
}
