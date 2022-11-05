package JavaDemo.juc.DesignPattern;

public class PostMan extends Thread{
    private int id;
    private Object mail;

    public PostMan(int id, Object mail) {
        this.id = id;
        this.mail = mail;
    }

    @Override
    public void run() {
        GuardedSuspension guard = MailBoxes.getGuard(id);
        System.out.println("送信，内容是："+mail);
        guard.complete(mail);



    }
}
