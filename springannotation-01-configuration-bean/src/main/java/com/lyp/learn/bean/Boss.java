package com.lyp.learn.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-02 06:18
 */
@Component
public class Boss {
    /**
     * @Autowired
     *             1. 标注在setter方法上
     *             2. 标注在构造方法上
     *                只有一个有参构造器时，Autowire 可以省略
     *             3. 标注在1,2中的方法的参数前
     *             4. 标注在属性上
     */

    @Autowired
    Car car;

    //@Autowired
//    public Boss(Car car){
//        this.car = car;
//    }

    public Car getCar() {
        return car;
    }

    //@Autowired
    // public void setCar(@Autowired Car car) {
    public void setCar( Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
