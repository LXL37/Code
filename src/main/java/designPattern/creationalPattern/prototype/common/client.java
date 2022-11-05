package designPattern.creationalPattern.prototype.common;

public class client {
    public static void main(String[] args) {
        ConcretePrototypeA originalA = new ConcretePrototypeA("originalA");
        System.out.println(originalA);
        ConcretePrototypeA concretePrototypeA = originalA.clone();
        concretePrototypeA.desc="cloneA";
        System.out.println(concretePrototypeA);

        ConcretePrototypeB concretePrototypeB=new ConcretePrototypeB("originalB");
        ConcretePrototypeB clone = concretePrototypeB.clone();
        System.out.println(clone);
    }
    interface IPrototype<T>{
        T clone();
    }
    static class ConcretePrototypeB implements IPrototype<ConcretePrototypeB>{
        private String desc;

        public ConcretePrototypeB(String desc) {
            this.desc = desc;
        }

        @Override
        public ConcretePrototypeB clone() {
            return new ConcretePrototypeB(this.desc);
        }

        @Override
        public String toString() {
            return "ConcretePrototypeB{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }
    static class ConcretePrototypeA implements IPrototype<ConcretePrototypeA>{
        private String desc;

        public ConcretePrototypeA(String desc) {
            this.desc = desc;
        }

        @Override
        public ConcretePrototypeA clone() {
            return new ConcretePrototypeA(this.desc);
        }

        @Override
        public String toString() {
            return "ConcretePrototypeA{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }


}
