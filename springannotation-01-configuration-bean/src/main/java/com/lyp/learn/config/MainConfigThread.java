package com.lyp.learn.config;

import com.lyp.learn.threadsafe.DolphinService;
import com.lyp.learn.threadsafe.FishService;
import com.lyp.learn.threadsafe.XiaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author liyapu
 * @date 2024-04-13 19:36
 * @description
 */
@Configuration
public class MainConfigThread {

    @Bean
    public FishService fishService() {
        return new FishService();
    }

    @Bean
    @Scope("prototype")
    public DolphinService dolphinService() {
        return new DolphinService();
    }

    @Bean
    public XiaService xiaService() {
        return new XiaService();
    }
}
