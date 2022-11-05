package designPattern.structuralPattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
    private static Map<String,ITicket> ticketMap=new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from,String to){
        String key=from+"->"+to;
        if (!ticketMap.containsKey(key)){
            System.out.println("首次查询！创建对象");
            ITicket ticket=new TrainTicket(from, to);
            ticketMap.put(key,ticket);
            return ticket;
        }else {
            System.out.println("多次查询使用缓存对象");
            return ticketMap.get(key);
        }
    }
}
