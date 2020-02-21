package com.mutong.factory.singfactory;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/7 17:23
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
