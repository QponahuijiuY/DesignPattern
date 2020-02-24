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

        AbsFactory absFactory1 = new HpFactory();
        AbsFactory absFactory2 = new DellFactory();
        Mouse hpmouse = absFactory1.createMouse();
        Keybo hpkeybo = absFactory1.createKeybo();
        Keybo dellkeybo1 = absFactory2.createKeybo();
        Keybo dellkeybo2 = absFactory2.createKeybo();

        hpmouse.sayHi();
        hpkeybo.sayHi();
        dellkeybo1.sayHi();
        dellkeybo1.sayHi();

    }
}
