package designPattern.creationalPattern.simpleFactory.common;

public enum ProductEnum {
    PRODUCT_A(1),
    PRODUCT_B(2);

    private int type;

    ProductEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }


}
