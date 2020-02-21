package com.mutong.factory.abstraction;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:45
 */
public class DellKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("生产戴尔键盘");
    }
}
