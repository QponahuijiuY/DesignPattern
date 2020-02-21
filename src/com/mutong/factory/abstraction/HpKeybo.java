package com.mutong.factory.abstraction;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:44
 */
public class HpKeybo implements Keybo {
    @Override
    public void sayHi() {
        System.out.println("生产Hp键盘");
    }
}
