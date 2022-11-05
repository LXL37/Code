package designPattern.structuralPattern.flyweight;

public class Client {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("济南", "临沂");
        ITicket ticket1 = TicketFactory.queryTicket("济南", "临沂");
        ticket1.showInfo("硬座");
        ticket.showInfo("硬座");

    }
}
