package designPattern.behavioralPattern.template;

public abstract class AbstractCourse {
    public final void createCourse() {
        //1 发布预习资料
        postPreResource();

        //2 制作课件ppt
        createPPT();

        //3 在线直播
        liveVideo();
        //4 上传课后资料
        postResource();
        //5 布置作业
        postHomework();
        if (needCheckHomework()){
            checkHomework();
        }
    }

    protected boolean needCheckHomework() {
        return false;
    }

    protected  abstract void checkHomework();

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播课程");
    }

    protected void createPPT() {
        System.out.println("制作ppt");
    }

    protected void postPreResource() {
        System.out.println("上传预习资料");
    }
}
