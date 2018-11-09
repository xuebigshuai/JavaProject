package com.smart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/14.
 */
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@RestController
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }

    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;
   @RequestMapping("/")
    public String index(){
        return "book name is :"+name+" and book author is:"+author;
   }
}
