package designPattern.creationalPattern.simpleFactory.common;

/**
 * @author liuxiaolei
 */
public class ProductSimpleFactory {
    public ProductSimpleFactory() {
    }

    public  IProduct creteProduct(ProductEnum type){
        switch (type){
            case PRODUCT_A:
                return new ConcreteProductA();
            case PRODUCT_B:
                return new ConcreteProductB();
            default:
                return null;
        }
    }
    public void getA(){

    }
}
