package com.smart;

import com.smart.domain.AutorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Suresh on 2018/3/19.
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private AutorSettings autorSettings;

    @RequestMapping("/")
    public String index(){
        return "author name is "+ autorSettings.getName()+" and author age is "+ autorSettings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(Application.class);
        springApplication.run(args);
    }
}
