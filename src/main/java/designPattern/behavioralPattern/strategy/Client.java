package designPattern.behavioralPattern.strategy;

public class Client {
    public static void main(String[] args) {
        PromotionStrategyFactory factory=new PromotionStrategyFactory();
        CouponStrategy couponStrategy = (CouponStrategy) factory.createPromotionStrategy(CouponStrategy.class);
        couponStrategy.doPromotion();

    }
}
