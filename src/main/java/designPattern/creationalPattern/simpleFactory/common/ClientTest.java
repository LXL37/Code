package designPattern.creationalPattern.simpleFactory.common;

public class ClientTest {
    public static void main(String[] args) {

        ProductSimpleFactory simpleFactory=new ProductSimpleFactory();
        simpleFactory.creteProduct(ProductEnum.PRODUCT_A).doSomething();
    }
}
