package designPattern.structuralPattern.bridge;

/**
 * 信息的统一发送接口
 * @author liuxiaolei
 */
public interface IMessage {

    void send(String msg,String toUser);
}
