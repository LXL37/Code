package designPattern.structuralPattern.bridge;

/**
 * @author liuxiaolei
 * 抽象消息类
 */
public class AbstractMessage {
    IMessage message;
    //注入实现的对象
    public AbstractMessage(IMessage message){
        this.message=message;
    }
    //发送消息 委派给实现方法的对象
    public void sendMessage(String msg,String toUser){
        this.message.send(msg,toUser);
    }
}
