package com.lyp.learn.importtest01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyapu
 * @date 2024-04-14 20:20
 * @description
 */
@Configuration
//扫描当前的包，如果未定义特定的包，则将从声明此注释的类的包进行扫描
@ComponentScan("com.lyp.learn.importtest01")
//@ComponentScan //扫描当前包
public class MainConfig {

}
