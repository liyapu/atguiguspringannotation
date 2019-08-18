package com.lyp.learn;

import com.lyp.learn.aware.MyApplicationContext;
import com.lyp.learn.aware.MyBeanFactory;
import com.lyp.learn.bean.Boss;
import com.lyp.learn.bean.Car;
import com.lyp.learn.bean.Color;
import com.lyp.learn.config.MainConfigAutowire;
import com.lyp.learn.config.MainConfigAware;
import com.lyp.learn.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 16:40
 */
public class IOCAwareTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfigAware.class);
       printAllBeans(ac);

       System.out.println("-------------------");
       MyApplicationContext mac = (MyApplicationContext) ac.getBean("myApplicationContext");
       System.out.println(mac);
       MyBeanFactory myBeanFactory = (MyBeanFactory) ac.getBean("myBeanFactory");
       System.out.println(myBeanFactory);

   }

    public void printAllBeans(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

}
