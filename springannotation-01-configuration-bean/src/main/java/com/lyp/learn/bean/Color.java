package com.lyp.learn.bean;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-01 14:57
 */

public class Color {

    Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
