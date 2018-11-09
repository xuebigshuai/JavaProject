package com.smart.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/3/16.
 */
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("I love you")
    private String mormal;

    @Value("${book.name}")
    private String bookName;
}
