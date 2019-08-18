package com.lyp.learn.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: liyapu
 * @Description: 判断系统是否是 Linux
 * @create: 2019-08-01 14:30
 */
public class ConditionLinux implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if(osName.contains("Linux")){
            return true;
        }
        return false;
    }
}
