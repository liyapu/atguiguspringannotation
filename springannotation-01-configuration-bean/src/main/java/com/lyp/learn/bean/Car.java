package com.lyp.learn.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 16:38
 */
@Component
public class Car {

    public Car(){
        System.out.println("Car 创建了.......");
    }

    public void init(){
        System.out.println("Car 的 init 方法.....");
    }

    public void destroy(){
        System.out.println("Car 的 destroy....");
    }
}
