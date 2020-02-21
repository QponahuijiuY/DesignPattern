package com.mutong.factory.singfactory;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/7 17:24
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
