package com.lyp.learn.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: liyapu
 * @Description: 需要使用spring 底层的 什么容器或者组件，
 *               可以实现 xxxAware 接口，接收容器的注入
 * @create: 2019-08-02 06:46
 */
@Component
public class MyApplicationContext implements ApplicationContextAware {
    //接收spring容器注入的applicationContext，以便后来使用
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    public void printApplicationContext(){
        System.out.println(applicationContext);
    }
}
