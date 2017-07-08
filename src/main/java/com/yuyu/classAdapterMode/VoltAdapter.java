package com.yuyu.classAdapterMode;

/**
 * Created by yuyu on 2017/7/5.
 * 类适配器模式
 * Adapter角色 实现了我们想要的5伏特的接口，同时也提供了220伏特的方法，使两个不同的接口可以一起工作
 */
public class VoltAdapter extends Volt220 implements FiveVolt{

    public int getVolt5() {
        return 5;
    }


    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("getVolt5:"+adapter.getVolt5());
        System.out.println("getVolt220:"+adapter.getVolt220());
    }
}
