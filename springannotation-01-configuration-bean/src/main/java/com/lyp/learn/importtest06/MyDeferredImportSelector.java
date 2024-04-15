package com.lyp.learn.importtest06;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liyapu
 * @date 2024-04-15 08:19
 * @description DeferredImportSelector延迟导入选择器是Spring提供的一个扩展导入器，
 * 该导入器是ImportSelector的一个变体，该导入器是在处理配置类上@Import注解的时候注册的，
 * 当所有{@code @Configuration}配置类解析完成后才会运行所有被注册的DeferredImportSelector。
 * 该导入器的主要作用是，委托Group接口导入一组配置类。
 * Springboot 的AutoConfigurationImportSelector实现了该接口，用于自动装配类的获取。
 */
public class MyDeferredImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.lyp.learn.importtest06.User"};
    }
}















