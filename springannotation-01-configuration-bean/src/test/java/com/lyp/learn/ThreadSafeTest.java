package com.lyp.learn;

import com.lyp.learn.config.MainConfigThread;
import com.lyp.learn.threadsafe.DolphinService;
import com.lyp.learn.threadsafe.FishService;
import com.lyp.learn.threadsafe.XiaService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyapu
 * @date 2024-04-13 19:33
 * @description
 */
public class ThreadSafeTest {

    @Test
    public void test01() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigThread.class);

        //线程一
        FishService fishService1 = (FishService) ac.getBean("fishService");
        new Thread(() -> {
            System.out.println(fishService1.welcome("张三"));
            System.out.println(fishService1.hello("张三"));
        }).start();

        //线程二
        FishService fishService2 = (FishService) ac.getBean("fishService");
        new Thread(() -> {
            System.out.println(fishService2.welcome("李四"));
            System.out.println(fishService2.hello("李四"));
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====结束==========");
    }

    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigThread.class);

        //线程一
        DolphinService dolphinService1 = ac.getBean(DolphinService.class);
        new Thread(() -> {
            System.out.println(dolphinService1.welcome("海海"));
            System.out.println(dolphinService1.hello("海海"));
        }).start();

        //线程二
        DolphinService dolphinService2 = ac.getBean(DolphinService.class);
        new Thread(() -> {
            System.out.println(dolphinService2.welcome("豚豚"));
            System.out.println(dolphinService2.hello("豚豚"));
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====结束==========");
    }


    @Test
    public void test03() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigThread.class);

        //线程一
        XiaService xiaService1 = ac.getBean(XiaService.class);
        new Thread(() -> {
            System.out.println(xiaService1.welcome("小虾"));
            System.out.println(xiaService1.hello("小虾"));
        }).start();

        //线程二
        XiaService xiaService2 = ac.getBean(XiaService.class);
        new Thread(() -> {
            System.out.println(xiaService2.welcome("龙虾"));
            System.out.println(xiaService2.hello("龙虾"));
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====结束==========");
    }
}
