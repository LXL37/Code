package designPattern.behavioralPattern.strategy;

import designPattern.creationalPattern.simpleFactory.ICourse;

public class PromotionStrategyFactory {
    public IPromotionStrategy createPromotionStrategy(Class<? extends IPromotionStrategy> promotion){


        try {
            return promotion.newInstance();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
