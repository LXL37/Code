package jvm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

public class test2 {



        class GrandFather {
            void thinking() {
                System.out.println("i am grandfather");
            }
        }

        class Father extends GrandFather {
            @Override
            void thinking() {
                System.out.println("i am father");
            }
        }

        class Son extends Father {
            @Override
            void thinking() {
                try {
                    MethodType mt = MethodType.methodType(void.class);
                    Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                    lookupImpl.setAccessible(true);
                    MethodHandle mh = ((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class,"thinking", mt, GrandFather.class);
                    mh.invoke(this);
                } catch (Throwable e) {
                }
            }
        }

        public  static void main(String[] args) {
            (new test2().new Son()).thinking();
        }


}
