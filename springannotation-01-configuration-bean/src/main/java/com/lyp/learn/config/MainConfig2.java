package com.lyp.learn.config;

import com.lyp.learn.bean.Color;
import com.lyp.learn.bean.ColorFactoryBean;
import com.lyp.learn.bean.Person;
import com.lyp.learn.condition.ConditionLinux;
import com.lyp.learn.condition.ConditionWindows;
import com.lyp.learn.condition.MyImportBeanDefinitionRegistrar;
import com.lyp.learn.condition.MyImportSelector;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-07-31 22:57
 * @Configuration : 配置类，相当于以前的 xml 配置文件
 * 配置类==配置文件
 */
//告诉Spring这是一个配置类
@Configuration
@ComponentScan
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    /**
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     *
     * singleton: 单实例的(默认值):ioc 容器启动会调用方法创建对象放到ioc容器中，
     *            以后每次获取就是直接从容器中拿(从map中get一个对象)
     * prototype: 多实例的： ioc容器启动不会去调用方法创建对象放在容器中，
     *                      每次获取的时候才会调用方法创建对象
     * request: 同一个请求创建一个实例
     * session: 同一个session创建一个实例
     *
     * 懒加载：
     *          单实例bean:默认在容器启动的时候创建对象
     *          懒加载:容器启动不创建对象，第一次使用(获取)Bean创建对象，并初始化
     */
    @Lazy
    @Scope
    @Bean
    public Person person(){
        System.out.println("给容器添加 person");
        return new Person("王五","666888",25);
    }

    /**
     * @Conditional({Condition数组}) 按照一定的条件进行判断，满足条件给容器中注册bean
     * 如果系统是 windows, 给容器中注册("bill")
     * 如果系统是Linux, 给容器中注册("linus")
     * @return
     */
    @Bean("bill")
    @Conditional({ConditionWindows.class})
    public Person person01(){
        return new Person("比尔盖茨","widonws",60);
    }

    @Bean("linus")
    @Conditional({ConditionLinux.class})
    public Person person02(){
        return new Person("托瓦斯","linux",40);
    }


    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
