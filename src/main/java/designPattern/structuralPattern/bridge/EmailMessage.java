package designPattern.structuralPattern.bridge;

/**
 * @author liuxiaolei
 * 邮件消息
 */
public class EmailMessage implements IMessage{
    @Override
    public void send(String msg, String toUser) {
        System.out.println("发送邮件："+msg+",To:"+toUser);
    }
}
