package designPattern.behavioralPattern.strategy;

public class GroupBuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团促销");
    }
}
