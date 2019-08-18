package com.lyp.learn.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author: liyapu
 * @Description: 一个类可以实现多个 xxxAware,
 * @create: 2019-08-02 06:51
 */
@Component
public class MyBeanFactory implements BeanFactoryAware,BeanNameAware,EnvironmentAware {
    private BeanFactory beanFactory;
    private Environment environment;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("------------------" + name);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println(environment);
    }
}
