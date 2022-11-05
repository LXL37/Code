package JavaDemo.juc.DesignPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liuxiaolei
 */

public class GuardedSuspension {
    private Object res;
    private int id;

    public GuardedSuspension(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GuardedSuspension() {
    }

    public Object getRes(long timeout){
        synchronized (this){
            long beginTime=System.currentTimeMillis();
            long passTime=0;

            while (res==null){
                //还需要等待的时间  因此是notifyAll存在虚假唤醒
                long waitTime=timeout-passTime;
                if (waitTime<=0){
                    System.out.println("超时");
                    break;
                }
                System.out.println(Thread.currentThread()+"等待结果:"+ waitTime);
                try {
                    this.wait(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                passTime=System.currentTimeMillis()-beginTime;
            }

            return res;
        }

    }
    public Object getRes(){

        synchronized (this){


            while (res==null){
                System.out.println(Thread.currentThread()+"等待结果");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(Thread.currentThread()+"返回结果");
            return res;
        }
    }

    public void complete(Object res){
        synchronized (this){
            System.out.println(Thread.currentThread()+"计算结果:"+res);
            this.res=res;
            this.notifyAll();
        }

    }


}
