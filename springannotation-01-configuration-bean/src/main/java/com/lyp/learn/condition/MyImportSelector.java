package com.lyp.learn.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: liyapu
 * @Description: 自定义逻辑，返回需要导入的组件
 *
 * @create: 2019-08-01 15:14
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回值，就是要导入到容器汇总的组件全类名
     * AnnotationMetadata： 当前标注@Import注解类的所有注解信息
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.lyp.learn.bean.Green","com.lyp.learn.bean.Blue"};
    }
}
