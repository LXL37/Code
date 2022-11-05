package designPattern.creationalPattern.singletonPattern;

/**
 * @author liuxiaolei
 * 静态内部类的实现方式
 */
public class Singleton {

    private Singleton(){

    }
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
    private static Singleton getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
