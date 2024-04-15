package com.lyp.learn.threadsafe;

/**
 * @author liyapu
 * @date 2024-04-13 19:27
 * @description 面试题: spring中bean线程安全吗？
 *
 * Spring框架中Bean的线程安全性取决于多个因素，包括Bean的作用域和是否具有状态。以下是详细介绍：
 * 1.单例Bean（singleton）
 * Spring容器默认创建的Bean都是单例的，即在整个容器中只有一个实例。这意味着所有线程共享同一个Bean实例，因此如果有线程安全的问题，比如多个线程同时访问并修改Bean中的状态，就会导致问题。
 * 但是，如果Bean被设计为无状态的，即Bean的操作不涉及修改实例变量，那么这个单例Bean是线程安全的。
 * 即，单例情况下，无共享变量读写，是安全的，否则不线程安全
 * 2.原型Bean（prototype）
 * 每次获取都创建一个新的实例，因此不存在线程安全问题
 * 3.作用域Bean。
 * 如以request或session为作用域的Bean，它们会在不同的线程中拥有不同的实例，因此避免了线程安全问题。
 *
 * 总结来说，Spring容器本身并不直接保证Bean的线程安全。开发者需要根据具体的Bean作用域和是否具有状态来决定如何使用Bean，并采取适当的措施（如使用ThreadLocal或同步机制）来确保线程安全。
 *
 *
 * =====================
 * SpringBean是线程安全的吗？
 *
 * Spring本身并没有针对Bean做线程安全的处理，所以:
 * 1.如果Bean是无状态的，那么Bean则是线程安全的
 * 2.如果Bean是有状态的，那么Bean则不是线程安全的
 *
 * 另外，Bean是不是线程安全，跟Bean的作用域没有关系，Bean的作用域只是表示Bean的生命周期范围，
 * 对于任何生命周期的Bean都是一个对象，这个对象是不是线程安全的，还是得看这个Bean对象本身。
 *
 * 无状态：表示这个实例没有属性对象，不能保存实数据，是不变的类。比如：controller、service、dao。
 * 有状态：表示实例是有属性的对象，可以保存数据，是线程不安全的，比如：pojo。
 *
 * 原文链接：https://blog.csdn.net/dayuiicghaid/article/details/125262064
 *
 *
 * =================================
 * 1.单例Bean的情况
 * 如果在类中声明成员变量 并且有读写操作(有状态)，就会线程不安全
 * 但是！
 * 只需要把成员变量声明在方法中，单例Bean是线程安全的
 *
 * Spring如何处理线程并发问题？
 * 1.设置对象为原型 prototype
 * 2.将成员变量放到ThreadLocal中
 * 3.使用同步锁 synchronized,会影响服务的吞吐量，把并行变成了串行
 */
public class FishService {

    //成员变量 有读写操作，线程不安全
    private String name;

    /**
     * 线程不安全的
     * 操作对象的共有变量，同一片内存区域
     */
    public String welcome(String nickName) {
        //成员变量 读写
        name = "welcome:" + nickName;
        //模拟业务处理
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return name;
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
