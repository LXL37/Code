package designPattern.creationalPattern.abstractFactory;

/**
 * @author liuxiaolei
 * 用户的主入口，spring常用的
 */
public abstract class CourseFactory {
    public void init(){

        System.out.println("初始化基础数据");
    }
    abstract INote createNode();
    abstract IVideo createVideo();
}
