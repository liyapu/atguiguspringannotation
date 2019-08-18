package com.lyp.learn;

import com.lyp.learn.bean.Person;
import com.lyp.learn.bean.Student;
import com.lyp.learn.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 16:40
 */
public class IOCPropertyValueTest {


   @Test
   public void test01(){
       ApplicationContext ac =  new AnnotationConfigApplicationContext( MainConfigOfPropertyValue.class);
       printAllBeans(ac);
       System.out.println("----------------------------");
       Student student = (Student) ac.getBean("student");
       System.out.println(student);

       Environment environment = ac.getEnvironment();
       String password = environment.getProperty("password");
       System.out.println("pasword ====" + password);

   }

    public void printAllBeans(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
