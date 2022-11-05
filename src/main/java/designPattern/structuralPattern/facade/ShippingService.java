package designPattern.structuralPattern.facade;

public class ShippingService {
    public String delivery(GiftInfo giftInfo){

        System.out.println(giftInfo.getName()+"开始物流");

        return "NO:123";
    }
}
