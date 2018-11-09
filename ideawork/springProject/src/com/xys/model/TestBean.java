package com.xys.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2018/2/9.
 */
public class TestBean implements BeanNameAware,BeanFactoryAware
        ,ApplicationContextAware,DisposableBean,BeanPostProcessor,InitializingBean {
    private String id;
    @Override
    public void setBeanName(String s) {
        this.id=s;
    }



    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("实现销毁的接口！！！！");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println(s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(s);
        return o;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化时调用的方法");
        System.out.println(id);
    }
}
