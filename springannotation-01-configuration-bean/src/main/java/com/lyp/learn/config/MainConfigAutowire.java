package com.lyp.learn.config;

import com.lyp.learn.bean.Car;
import com.lyp.learn.bean.Color;
import org.springframework.beans.factory.annotation.Autowired;
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
        "com.lyp.learn.dao","com.lyp.learn.bean"})
public class MainConfigAutowire {

    /**
     * @Bean 标注的方法创建对象时，方法参数的值会从容器中获取
     *      比如，下面的 car, 会从容器中取，当做color(car)的方法参数
     * @param car
     * @return
     */
    @Bean
    public Color color( Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
