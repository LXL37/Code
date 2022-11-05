package designPattern.structuralPattern.decorator;

public class SausageDecorator extends BatterCakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    String getMsg() {
        return super.getMsg()+"加一个香肠";
    }

    @Override
    int getPrice() {
        return super.getPrice()+PriceEnum.SAUSAGE.getPrice();
    }

    @Override
    void doSomething() {

    }
}
