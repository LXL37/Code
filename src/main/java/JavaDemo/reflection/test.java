package JavaDemo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * @author liuxiaolei
 */
public class test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> userClass=  Class.forName("JavaDemo.reflection.User");
        User users=(User) userClass.newInstance();
        System.out.println(users);

        Constructor<User>[] constructors = (Constructor<User>[]) userClass.getConstructors();
        for (Constructor<User> constructor : constructors) {
            System.out.println("构造函数："+constructor);
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("构造参数："+parameter);
            }
        }
        Field[] fields = userClass.getFields();
        System.out.println(fields);
        for (Field field : fields) {
            System.out.println("字段："+ field);

        }


    }
}
