package com.xys.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/24.
 */
@Component("single")
public class PerformNeed {
    public  void beforePeform(){
        System.out.println("请关掉您的手机");
    }

    public void takeSet(){
        System.out.println("请带上您的板凳");
    }

    public  void afterPeform(){
        System.out.println("啪啪啪啪啪啪啪啪");
    }
    public  void error(){
        System.out.println("我要退钱");
    }
}
