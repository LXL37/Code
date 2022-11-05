package JavaDemo.juc.DesignPattern;

public class test {

    public static void main(String[] args) throws InterruptedException {


        test2();

    }
    public static void test2() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            new People().start();
        }
        Thread.sleep(1000);

        for (Integer id : MailBoxes.getIds()) {
            new PostMan(id,"msg"+id).start();
        }

    }
    public void  test1(){
        GuardedSuspension guardedSuspension=new GuardedSuspension();
        new Thread(()->{
            Object res = guardedSuspension.getRes(3000);
            System.out.println(Thread.currentThread()+"获取到到结果是："+ res);

        },"t1").start();

        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            guardedSuspension.complete(1);
/*
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            guardedSuspension.complete(1);*/
        },"t2").start();

    }
}
