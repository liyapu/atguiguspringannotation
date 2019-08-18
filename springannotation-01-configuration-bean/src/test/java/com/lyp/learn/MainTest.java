package com.lyp.learn;


import com.lyp.learn.bean.Person;
import com.lyp.learn.config.MainConfig;
import com.lyp.learn.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class MainTest {

    @Test
    public void testPerson1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void TestPerson2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) applicationContext.getBean("person");
        Person person =  applicationContext.getBean(Person.class);
        System.out.println(person);

        //容器中的 Person 类型的bean名字
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for(String bn : beanNamesForType){
            System.out.println(bn);
        }

        //输出容器中的所有bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void testComponentScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        //输出此容器中的所有bean
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    public void printAllBeans(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void testScope(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
        Person person = (Person) ac.getBean("person");
        Person person2 = (Person) ac.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    public void testConditional(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);

        Environment environment = ac.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("osName ------" + osName);
        // 在运行时，可以在configuration ----> VM Options --> 设置参数 -Dos.name=Linux
        //输出此容器中的所有bean
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void testImport(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig2.class);
        printAllBeans(ac);
        //实际类型是Color 类型的
        Object colorFactoryBean = ac.getBean("colorFactoryBean");
        System.out.println(colorFactoryBean.getClass());
        //class com.lyp.learn.bean.Color
        // 添加 & ,获取工厂本身
        Object colorFactoryBeanObject = ac.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBeanObject.getClass());
    }



}
