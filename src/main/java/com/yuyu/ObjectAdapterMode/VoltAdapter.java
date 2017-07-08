package com.yuyu.ObjectAdapterMode;

import com.yuyu.classAdapterMode.FiveVolt;
import com.yuyu.classAdapterMode.Volt220;

/**
 * Created by yuyu on 2017/7/5.
 * 对象适配器
 * 对象适配器比类适配器更加灵活,被适配对象中的方法不会被暴露出来,在使用中应尽量使用对象适配器,多用合成或聚合,少用继承.
 */
public class VoltAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt5() {
        return 0;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }

    public static void main(String[] args) {
        Volt220 v220 = new Volt220();
        VoltAdapter adapter = new VoltAdapter(v220);
        adapter.getVolt5();
        adapter.getVolt220();
        System.out.println("getVolt5:"+adapter.getVolt5());
        System.out.println("getVolt220:"+adapter.getVolt220());
    }
}
