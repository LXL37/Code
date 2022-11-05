package designPattern.structuralPattern.bridge;

/**
 * @author liuxiaolei
 * 普通消息类
 */
public class NormaMessage extends AbstractMessage{
    public NormaMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        super.sendMessage(msg, toUser);
    }
}
