package designPattern.structuralPattern.facade;

public class GIftFacadeService {
    private PaymentService paymentService=new PaymentService();
    private QualifyService qualifyService=new QualifyService();
    private ShippingService shippingService=new ShippingService();
    public void exchange(GiftInfo giftInfo){
        if (qualifyService.isAvailable(giftInfo)){
            if (paymentService.isPay(giftInfo)){
                String giftNum=shippingService.delivery(giftInfo);
                System.out.println("单号是"+giftNum);
            }
        }

    }
}
