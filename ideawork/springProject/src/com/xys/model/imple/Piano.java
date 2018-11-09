package com.xys.model.imple;

import com.xys.model.Instrument;

/**
 * Created by Administrator on 2018/2/9.
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("他弹得是钢琴！！");
    }
}
