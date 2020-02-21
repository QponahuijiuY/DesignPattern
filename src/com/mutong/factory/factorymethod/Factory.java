package com.mutong.factory.factorymethod;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/9 22:16
 */
public interface Factory {
    Product Manufacture();

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();
        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
    }
}
