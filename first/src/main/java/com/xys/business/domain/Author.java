package com.xys.business.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/11/9.
 */
@Component
/**
 * @ConfigurationProperties 中的location在1.5.1版本后该属性已经去除
 */
@ConfigurationProperties("author")
@PropertySource("classpath:author.properties")
public class Author {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
