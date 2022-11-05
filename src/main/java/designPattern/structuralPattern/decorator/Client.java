package designPattern.structuralPattern.decorator;

import designPattern.structuralPattern.decorator.BaseBattercake;
import designPattern.structuralPattern.decorator.Battercake;
import designPattern.structuralPattern.decorator.EggDecorator;
import designPattern.structuralPattern.decorator.SausageDecorator;

public class Client {
    public static void main(String[] args) {
        Battercake battercake;
        battercake=new BaseBattercake();
        battercake=new EggDecorator(battercake);
        battercake=new SausageDecorator(battercake);
        System.out.println(battercake.getMsg());
        System.out.println("总价是"+battercake.getPrice());
    }
}
