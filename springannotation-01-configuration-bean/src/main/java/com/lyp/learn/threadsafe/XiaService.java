package com.lyp.learn.threadsafe;

/**
 * @author liyapu
 * @date 2024-04-13 19:27
 * Spring如何处理线程并发问题？
 * 1.设置对象为原型 protoType
 * 2.将成员变量放到ThreadLocal中 （本类）
 */
public class XiaService {

    //成员变量 有读写操作，线程不安全
    private ThreadLocal<String> nameTl = new ThreadLocal<>();

    /**
     * 线程不安全的
     * 操作对象的共有变量，同一片内存区域
     */
    public String welcome(String nickName) {
        //成员变量 读写
        nameTl.set("welcome:" + nickName);
        //模拟业务处理
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return nameTl.get();
    }


    /**
     * 线程安全
     * 方法有自己的栈帧，方法之间相互独立
     */
    public String hello(String n) {
        String helloLine = "Hello," + n;
        //模拟业务处理
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return helloLine;
    }

}