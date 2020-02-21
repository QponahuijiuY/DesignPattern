package com.mutong.factory.abstraction;




/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/21 12:29
 */
public interface AbsFactory {
    Mouse createMouse();
    Keybo createKeybo();

    public static void main(String[] args) {

        AbsFactory absFactory = new HpFactory();
        AbsFactory absFactory2 = new DellFactory();
        Mouse hpmouse = absFactory.createMouse();
        Keybo hpkeybo = absFactory.createKeybo();
        Keybo dellkeybo1 = absFactory2.createKeybo();
        Keybo dellkeybo2 = absFactory2.createKeybo();

        hpmouse.sayHi();
        hpkeybo.sayHi();
        dellkeybo1.sayHi();
        dellkeybo1.sayHi();

    }
}
