package com.lyp.learn.config;

import com.lyp.learn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-07-31 22:57
 * @Configuration : 配置类，相当于以前的 xml 配置文件
 * 配置类==配置文件
 */
//告诉Spring这是一个配置类
@Configuration
@ComponentScan(basePackages = "com.lyp.learn",excludeFilters = {
        //排查Controller,Service 注解
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Service.class})
})
public class MainConfig {

    /**
     *  @Bean : 给容器中注册一个Bean; 类型为返回值的类型，id默认是用方法名作为id (id 也可以通过    @Bean(name = "per")修改)
     *
     * @return
     */
    @Bean
    public Person person(){
        return new Person("李四","小秘密密码",20);
    }
}
