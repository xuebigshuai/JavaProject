package com.xys.test;

import com.xys.service.TestModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/23.
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext application=new ClassPathXmlApplicationContext("config/springConfig.xml");
        TestModel testModel= (TestModel) application.getBean("test2");
        testModel.show();
    }


}
