package designPattern.structuralPattern.decorator;

public enum PriceEnum {
    //煎饼
    BASE_BATTERCAKE(5),
    EGG(1),
    SAUSAGE(2),

    ;

    private int price;

    PriceEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
