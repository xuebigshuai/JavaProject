package com.xys.business.controller;

import com.xys.business.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/9.
 */
@RestController
@RequestMapping("/xys")
public class Hello {

    @Autowired
    Author author;

    @RequestMapping("/hello")
    public String helloWorld() {

        return "你好";
    }

    @RequestMapping("/author")
    public String author() {
        String info = author.getName()+"is"+author.getAge()+"old";

        return info;
    }
}
