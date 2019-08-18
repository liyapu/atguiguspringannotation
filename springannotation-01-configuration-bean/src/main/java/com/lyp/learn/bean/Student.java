package com.lyp.learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-07-31 22:51
 */
public class Student {
    /**
     * 使用@Value
     * 1. 基本数值
     * 2. 可以写SpEL, #{}
     * 3. 可以写${}，取出配置文件[xxx.properties]中值(在运行环境变量里面的值)
     */
    @Value("李世民")
    private String username;
    @Value("${password}")
    private String password;
    @Value("#{600 + 55}")
    private Integer age;

    public Student() {
    }

    public Student(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
