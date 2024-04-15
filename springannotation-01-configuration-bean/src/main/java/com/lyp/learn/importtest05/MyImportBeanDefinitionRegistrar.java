package com.lyp.learn.importtest05;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liyapu
 * @date 2024-04-14 20:47
 * @description
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取到所有的beanDefinition
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //获取到beanDefinition
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanDefinitionName);
            System.out.println("beanDefinition ==== " + beanDefinition.getBeanClassName());
        }

        //注册beanDefinition
        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setBeanClass(User.class);
        registry.registerBeanDefinition("user", definition);

    }


}











