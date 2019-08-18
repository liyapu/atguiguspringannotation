package com.lyp.learn.config;

import com.lyp.learn.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 */
@Configuration
//使用@PropertySource 读取外部配置文件中的K/V保存到运行的环境变量中；
//加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource("classpath:MyKey.properties")
public class MainConfigOfPropertyValue {

    @Bean
    public Student student(){
        return new Student();
    }
}
