package com.xys.test;

import com.xys.service.AopTestService;
import com.xys.service.DeclaretParent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/24.
 */
public class AopTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("config/AopConfig.xml");
        AopTestService aopTestService=applicationContext.getBean(AopTestService.class);
        DeclaretParent declaretParent= (DeclaretParent) aopTestService;
        aopTestService.show();
        declaretParent.play();

    }

    @Test
    public void Test(){
        System.out.println("单元测试");
    }
}
