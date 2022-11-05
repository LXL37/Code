package designPattern.structuralPattern.decorator;

public class BaseBattercake extends Battercake{
    @Override
    String getMsg() {
        return "煎饼";
    }

    @Override
    int getPrice() {
        return PriceEnum.BASE_BATTERCAKE.getPrice();
    }
}
