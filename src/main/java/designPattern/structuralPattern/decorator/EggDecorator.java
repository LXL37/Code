package designPattern.structuralPattern.decorator;

public class EggDecorator extends BatterCakeDecorator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    void doSomething() {

    }

    @Override
    String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }

    @Override
    int getPrice() {
        return super.getPrice()+PriceEnum.EGG.getPrice();
    }
}
