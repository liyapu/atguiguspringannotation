package com.lyp.learn.importtest04;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liyapu
 * @date 2024-04-14 20:20
 * @description
 */
@Configuration
//使用 @Import 导入Selector 的方式注入
@Import(MyImportSelector.class)
public class MainConfig {

}
