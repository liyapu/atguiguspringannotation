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
 * 初始化阶段，bean初始化生命周期阶段执行方法次序
 * 初始化阶段调用 XXXAware接口的SetXXX方法
 * 执行BeanPostProcessor实现类的postProcessBeforeInitialization方法
 * 执行InitializingBean接口的afterPropertiesSet方法
 * 执行bean定义中init-method属性指定的方法
 * 执行BeanPostProcessor实现类的postProcessAfterInitialization方法
 * 初始化阶段完成
 * 关闭容器，执行DisposableBean接口的destroy
 * 执行bean的destory-method属性指定的初始化方法
 *
 *
 *
 * ==================================
 * -----init-------
 * @PostConstruct ---> 被注解标注的方法
 * InitalizingBean ---> afterPropertiesSet
 * init-method ---> 通过配置指定的方法
 *
 * -------关闭容器close()时调用
 * @PreDestroy --->被注解标注的方法
 * DisposableBean ---> destroy
 * destroy-method --->通过配置指定的方法
 *
 */
public class IOCLifeCycleTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfigOfLifeCycle .class);

       Car car = (Car) ac.getBean("car");
       System.out.println(car);
       //强制转换一下类型，才会有 close 方法
       //容器关闭的时候，才会调用 destroy方法，进行bean的销毁
       ( (AnnotationConfigApplicationContext)ac).close();
   }
}
