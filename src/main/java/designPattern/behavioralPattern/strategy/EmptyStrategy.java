package designPattern.behavioralPattern.strategy;

public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
