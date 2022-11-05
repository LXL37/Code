package designPattern.structuralPattern.facade;

public class QualifyService {
    public boolean isAvailable(GiftInfo giftInfo){

        System.out.println("校验"+giftInfo.getName());
        System.out.println("校验成功");
        return true;
    }
}
