package com.lyp.learn;

import com.lyp.learn.aop.MathCalculator;
import com.lyp.learn.bean.Boss;
import com.lyp.learn.bean.Car;
import com.lyp.learn.bean.Color;
import com.lyp.learn.config.MainConfigAutowire;
import com.lyp.learn.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 16:40
 */
public class IOCAopTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
       //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
       MathCalculator mathCalculator = ac.getBean(MathCalculator.class);

       mathCalculator.div(10,2);


   }

    public void printAllBeans(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfigAutowire.class);
        printAllBeans(ac);

        System.out.println("-------------------");
        Boss boss = ac.getBean(Boss.class);
        System.out.println(boss);
        Car car = ac.getBean(Car.class);
        System.out.println(car);
        Color color = ac.getBean(Color.class);
        System.out.println(color);

    }
}
