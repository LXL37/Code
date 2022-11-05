package JavaDemo.Collections;

import JavaDemo.reflection.User;

import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {

    public static void main(String[] args) {

        User user1=new User("1","1",1);
        User user2=new User("2","2",2);
        User user3=new User("3","3",3);

        LinkedList<Object> objects = new LinkedList<>();
        objects.add(user1);
        objects.add(user2);
        objects.add(user3);
    }
}
