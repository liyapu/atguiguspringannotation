package com.lyp.learn;

import com.lyp.learn.bean.Car;
import com.lyp.learn.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 16:40
 */
public class IOCLifeCycleTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfigOfLifeCycle .class);

       Car car = (Car) ac.getBean("car");
       System.out.println(car);
       //强制转换一下类型，才会有 close 方法
       ( (AnnotationConfigApplicationContext)ac).close();
   }
}
