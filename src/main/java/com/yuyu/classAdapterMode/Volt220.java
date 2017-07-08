package com.yuyu.classAdapterMode;

/**
 * Created by yuyu on 2017/7/5.
 * 本类为Adaptee：适配者角色,被适配的接口
 * 对方想要一个5伏特的接口，但是我们现在只有一个220伏特的
 * 所以本类需要被适配成一个，可以提供5伏特的
 */
public class Volt220 {

    public int getVolt220(){
        return 220;
    }
}
