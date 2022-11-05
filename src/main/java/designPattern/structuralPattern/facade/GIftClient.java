package designPattern.structuralPattern.facade;

public class GIftClient {
    public static void main(String[] args) {
        GIftFacadeService gIftFacadeService=new GIftFacadeService();
        gIftFacadeService.exchange(new GiftInfo("java程序编程"));

    }
}
