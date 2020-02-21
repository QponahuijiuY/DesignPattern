package com.mutong.factory.factorymethod;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/9 22:18
 */
public class FactoryA implements Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
