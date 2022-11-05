package designPattern.creationalPattern.abstractFactory;

public class GoNote implements INote{
    @Override
    public void edit() {
        System.out.println("编写go笔记");
    }
}
