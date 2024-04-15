package com.lyp.learn.importtest05;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liyapu
 * @date 2024-04-14 20:20
 * @description
 */
@Configuration
//使用 @Import 导入BeanDefinitionRegistrar 的方式注入
@Import(MyImportBeanDefinitionRegistrar.class)
public class MainConfig {

}
