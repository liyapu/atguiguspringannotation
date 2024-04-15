package com.lyp.learn.importtest01;

/**
 * @author liyapu
 * @date 2024-04-15 08:26
 * @description @Import可以有几种用法？
 * 1.用于指定类 (如果配置类会按照配置类正常解析，如果是个普通类就会解析成Bean)
 * 2.通过ImportSelector可以一次性注册多个，返回一个String[] 每一个值就是类的完整类路径。
 * a.(子类) 通过 DeferredImportSelector 可以一次性注册多个，返回一个String[]每一个值就是类的完整类路径。
 * i.区别:DeferredImportSelector延迟导入，顺序靠后
 * 3.通过ImportBeanDefinitionRegistrar 可以一次性注册多个，通过BeanDefinitionRegistry来动态注册BeanDefinition
 */
public interface Info {

}

































