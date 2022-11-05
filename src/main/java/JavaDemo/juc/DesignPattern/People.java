package JavaDemo.juc.DesignPattern;

public class People extends Thread{

    @Override
    public void run() {

        GuardedSuspension guarded = MailBoxes.createGuarded();
        System.out.println(Thread.currentThread()+"收信Id："+guarded.getId());
        Object res = guarded.getRes(2000);
        System.out.println(Thread.currentThread()+"结果是："+res);


    }
}
