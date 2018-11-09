package com.xys.test;

import com.xys.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[] {"applicationConfig.xml"});
        User user=applicationContext.getBean("user",User.class);
        user.setName("薛煜帅");
        System.out.println(user);
        Calendar calendar=applicationContext.getBean("calendar",Calendar.class);
        System.out.println(calendar);

    }

}
