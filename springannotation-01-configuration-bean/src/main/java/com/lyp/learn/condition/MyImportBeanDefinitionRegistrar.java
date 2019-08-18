package com.lyp.learn.condition;

import com.lyp.learn.bean.RainBox;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 15:35
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata ：当前标注MyImportBeanDefinitionRegistrar 的类上的所有注解信息
     * BeanDefinitionRegistry ： BeanDefinition注册类
     *                      把所有需要添加到容器中的bean,
     *                      通过 BeanDefinitionRegistry.registerBeanDefinition 方法注册
     * @param importingClassMetadata
     * @param registry
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasGreen = registry.containsBeanDefinition("com.lyp.learn.bean.Green");
        boolean hasBlue = registry.containsBeanDefinition("com.lyp.learn.bean.Blue");
        //如果有绿色和蓝色，就注册彩虹
        if(hasGreen && hasBlue){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBox.class);
            registry.registerBeanDefinition("rainBox",beanDefinition);
        }
    }
}
