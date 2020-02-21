package com.mutong.factory.abstraction;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:43
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("生产Hp鼠标");
    }
}
