package com.mutong.factory.abstraction;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:41
 */
public class HpFactory implements AbsFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
