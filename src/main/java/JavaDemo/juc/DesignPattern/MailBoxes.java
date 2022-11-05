package JavaDemo.juc.DesignPattern;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MailBoxes {

    private static Map<Integer,GuardedSuspension> boxes=new Hashtable<>();

    private static int id=1;

    private static synchronized int generateId(){
        return id++;
    }
    public static GuardedSuspension getGuard(int id){
        return boxes.remove(id);
    }

    public static GuardedSuspension createGuarded(){
        GuardedSuspension guardedSuspension=new GuardedSuspension(generateId());
        boxes.put(guardedSuspension.getId(),guardedSuspension);
        return guardedSuspension;

    }
    public static Set<Integer> getIds(){
        return boxes.keySet();
    }



}
