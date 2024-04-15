package com.lyp.learn.importtest03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyapu
 * @date 2024-04-14 20:33
 * @description
 */
@Configuration
public class MyBeanConfig {

    @Bean
    public User user() {
        return new User();
    }

}
