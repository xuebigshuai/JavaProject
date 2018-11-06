package com.xys.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/24.
 */
@Component("around")
public class watchPerformace {
    public void watchPerform(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("请关掉您的手机++++++");
        System.out.println("请带上您的板凳++++++++");
        try {
            long startTime=System.currentTimeMillis();
            proceedingJoinPoint.proceed();
            //Thread.sleep(500);
            long endTime=System.currentTimeMillis();
            long tome=endTime-startTime;
            System.out.println("啪啪啪啪啪啪啪啪;表演总花费"+tome+"ms");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
