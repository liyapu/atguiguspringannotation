package com.lyp.learn.config;

import com.lyp.learn.bean.Car;
import com.lyp.learn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 */
@ComponentScan("com.lyp.learn.bean")
@Configuration
public class MainConfigOfLifeCycle {


    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
