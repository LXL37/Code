package designPattern.structuralPattern.facade;

public class PaymentService {
    public boolean isPay(GiftInfo giftInfo){

        System.out.println(giftInfo.getName()+"支付成功");
        return true;
    }
}
