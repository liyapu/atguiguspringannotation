package com.lyp.learn;

import com.lyp.learn.importtest02.MainConfig;
import com.lyp.learn.importtest02.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyapu
 * @date 2024-04-14 20:25
 * @description
 */
public class Import02Test {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        User user = context.getBean(User.class);
        System.out.println("user = " + user);
        context.close();
    }


}
