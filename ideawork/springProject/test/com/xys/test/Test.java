package com.xys.test;

import com.xys.model.Audotorium;
import com.xys.model.City;
import com.xys.model.Singletonpattern;
import com.xys.service.Poem;
import com.xys.service.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/8.
 */
public class Test {
    public static void main(String[] args) {

        /*通过ClassPathApplicationContext初始化Spring容器*/
        ApplicationContext context= new  ClassPathXmlApplicationContext("config/applicationConfig.xml");
        Audotorium audotorium=  context.getBean("auditorium",Audotorium.class);
        Singletonpattern singletonPattern=context.getBean("singletonPattern",Singletonpattern.class);
        Poem poem=context.getBean("poem",Poem.class);
        poem.play();
        System.out.println(audotorium);
        System.out.println(singletonPattern);
        System.gc();
        City city=context.getBean("city",City.class);
        System.out.println(city.getChosenCity());

        TestModel testModel=context.getBean("model",TestModel.class);
        testModel.show();
    }
}
