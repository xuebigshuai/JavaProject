package com.smart.config;

import com.smart.domain.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2018/3/29.
 */
@Configuration
public class devTestBean {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public  TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
