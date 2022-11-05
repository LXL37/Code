package designPattern.creationalPattern.abstractFactory;

public class GoVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制go课程");
    }
}
