package designPattern.creationalPattern.abstractFactory;

public class JavaVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
