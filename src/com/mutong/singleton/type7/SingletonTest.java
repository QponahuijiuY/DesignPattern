package com.mutong.singleton.type7;

/**
 * @description: 静态内部类
 * @Author: Mutong
 * @Date: 2020/2/5 13:43
 */
public class SingletonTest {
}
class Singleton{
    private Singleton(){}
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
