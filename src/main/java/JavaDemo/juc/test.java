package JavaDemo.juc;

public class test {

   private static int num=0;
   private static final Object lock=new Object();
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (lock){

                System.out.println("开始处理");
                if (num==0){
                    System.out.println("等待数据");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (num!=0){
                    System.out.println("计算出的结果是:"+num);
                }

            }

        }).start();
        new Thread(()->{
            synchronized (lock){
                System.out.println("计算数据");
                num=10;
                lock.notify();

            }
        }).start();


    }
}
