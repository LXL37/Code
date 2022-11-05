package designPattern.structuralPattern.adapter;

public class PowerAdapter extends AC220 implements DC5{
    @Override
    public int output5V() {
        int input=super.output220();
        int output=input/44;

        System.out.println("输入电压"+input+",输出电压："+output);
        return output;
    }
}
