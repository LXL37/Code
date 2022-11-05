package designPattern.structuralPattern.bridge;

/**
 * @author liuxiaolei
 * 加急消息
 */
public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        msg="加急"+msg;
        super.sendMessage(msg, toUser);
    }
}
