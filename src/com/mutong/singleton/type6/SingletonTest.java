package com.mutong.singleton.type6;

/**
 * @description: 双重检查
 * @Author: Mutong
 * @Date: 2020/2/5 12:06
 */
public class SingletonTest {
}

class Singleton{
    private  Singleton(){
    }
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
