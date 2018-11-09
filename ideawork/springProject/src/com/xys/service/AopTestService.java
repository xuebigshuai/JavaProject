package com.xys.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/24.
 */
@Service
public class AopTestService {
    public void show(){
        System.out.println("面向切面编程");
    }
}
