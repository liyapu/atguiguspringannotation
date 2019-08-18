package com.lyp.learn.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: liyapu
 * @Description: 创建一个Spring定义的FactoryBean
 * @create: 2019-08-01 16:21
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    //返回一个Color对象，这个对象会添加到容器汇中
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否是单实例的
     * true : 单实例，只会创建一个
     * false: 多实例，每次调用都会创建一个
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}

