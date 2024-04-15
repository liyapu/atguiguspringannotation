package com.lyp.learn.importtest03;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liyapu
 * @date 2024-04-14 20:20
 * @description
 */
@Configuration
//使用 @Import 导入配置类 的方式注入
@Import(MyBeanConfig.class)
public class MainConfig {

}
