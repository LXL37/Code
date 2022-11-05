package designPattern.creationalPattern.factoryMethod.common;

import designPattern.creationalPattern.simpleFactory.common.IProduct;

/**
 * @author liuxiaolei
 */
public class commonClient {
    public interface IFactory{
        IProduct createProduct();
    }
    public interface IProduct{
        void  doSomething();
    }
    static class FactoryA implements IFactory{

        @Override
        public IProduct createProduct() {
            return new ProductA();
        }
    }
    static class FactoryB implements IFactory{

        @Override
        public IProduct createProduct() {
            return new ProductB();
        }
    }
    static class ProductA implements IProduct{

        @Override
        public void doSomething() {
            System.out.println("产品A");
        }
    }
    static class ProductB implements IProduct{

        @Override
        public void doSomething() {
            System.out.println("产品B");
        }
    }

    public static void main(String[] args) {
        IFactory factoryA=new FactoryA();
        IFactory factoryB=new FactoryB();
        factoryA.createProduct().doSomething();
        factoryB.createProduct().doSomething();
    }
}
