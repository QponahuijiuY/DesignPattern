package com.mutong.singleton.type4;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/5 12:06
 */
public class SingletonTest {
}

class Singleton{
    private  Singleton(){
    }
    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
