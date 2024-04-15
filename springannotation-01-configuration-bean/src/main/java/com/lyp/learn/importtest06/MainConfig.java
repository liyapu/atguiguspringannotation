package com.lyp.learn.importtest06;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liyapu
 * @date 2024-04-14 20:20
 * @description
 */
@Configuration
//使用 @Import 导入DeferredImportSelector 的方式注入
@Import(MyDeferredImportSelector.class)
public class MainConfig {

}
