package designPattern.structuralPattern.decorator;

public abstract class BatterCakeDecorator extends Battercake {
    private Battercake battercake;

    public BatterCakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    abstract void doSomething();

    @Override
    String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    int getPrice() {
        return this.battercake.getPrice();
    }

}
