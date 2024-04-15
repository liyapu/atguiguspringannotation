package com.lyp.learn.importtest04;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liyapu
 * @date 2024-04-14 20:39
 * @description
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //可以以字符串的形式注册多个Bean
        //字符串必须是类的完整限定名 getBean 不能根据名字获取的，必须要根据类型获取
        return new String[]{"com.lyp.learn.importtest04.User"};
        //return new String[]{ User.class.getName()};
    }
}













