package com.mutong.factory.factorymethod;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/9 22:17
 */
public class ProduceB implements Product {
    @Override
    public void show() {
        System.out.println("生产产品B");
    }
}
