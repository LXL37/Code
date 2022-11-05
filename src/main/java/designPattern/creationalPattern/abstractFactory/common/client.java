package designPattern.creationalPattern.abstractFactory.common;

public class client {
    public interface IFactory{
        IProductA createProductA();
        IProductB createProductB();
    }
    public interface IProductA{
        void  doA();
    }
    public interface IProductB{
        void doB();
    }
    static class AwithBrandA implements IProductA{

        @Override
        public void doA() {
            System.out.println("品牌A创建产品A");
        }
    }
    static class AwithBrandB implements  IProductA{

        @Override
        public void doA() {
            System.out.println("品牌b创建产品A");
        }
    }
    static class BwithBrandA implements IProductB{

        @Override
        public void doB() {
            System.out.println("品牌a创建产品b");
        }
    }
    static class BwithBrandB implements IProductB{

        @Override
        public void doB() {
            System.out.println("品牌b创建产品b");
        }
    }
    static class BrandBFactory implements IFactory{

        @Override
        public IProductA createProductA() {
            return new AwithBrandB();
        }

        @Override
        public IProductB createProductB() {
            return new BwithBrandB();
        }
    }
    static class BrandAFactory implements IFactory{

        @Override
        public IProductA createProductA() {
            return new AwithBrandA();
        }

        @Override
        public IProductB createProductB() {
            return new BwithBrandA();
        }
    }

    public static void main(String[] args) {
        IFactory a=new BrandAFactory();
        IFactory b=new BrandBFactory();
        a.createProductA().doA();
        a.createProductB().doB();
        b.createProductA().doA();
        b.createProductB().doB();
    }

}
