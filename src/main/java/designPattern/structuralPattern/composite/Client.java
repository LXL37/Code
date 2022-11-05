package designPattern.structuralPattern.composite;

public class Client {
    public static void main(String[] args) {
        File qq=new File("QQ.exe");
        File weChat=new File("WeChat.exe");
        Folder office=new Folder("办公软件",2);
        office.add(qq);
        office.add(weChat);
        office.show();
    }
}
