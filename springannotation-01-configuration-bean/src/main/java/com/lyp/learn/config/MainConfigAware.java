package com.lyp.learn.config;

import com.lyp.learn.bean.Car;
import com.lyp.learn.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 21:12
 */
@Configuration
@ComponentScan({"com.lyp.learn.service","com.lyp.learn.controller",
        "com.lyp.learn.dao","com.lyp.learn.aware"})
public class MainConfigAware {

}
