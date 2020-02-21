package com.mutong.factory.abstraction;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:42
 */
public class DellFactory implements AbsFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
