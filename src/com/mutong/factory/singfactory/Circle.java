package com.mutong.factory.singfactory;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/7 17:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
