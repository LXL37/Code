package designPattern.behavioralPattern.strategy;

public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠券促销");
    }
}
