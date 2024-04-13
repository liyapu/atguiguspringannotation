package com.lyp.learn.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 18:30
 */
@Component
public class MyPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyPostProcessor  ..... postProcessBeforeInitialization::::::" + beanName  + " ::::" + bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyPostProcessor  ..... postProcessAfterInitialization::::::" + beanName  + " ::::" + bean);
        return bean;
    }
}
