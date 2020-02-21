package com.mutong.singleton.type2;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/5 11:06
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}

/**
 * 饿汉式(静态代码块)
 */
class Singleton{
    //1.构造器私有化
    private  Singleton(){
    }
    //2.本类内部创建对象实例
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    //3.提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance(){
        //4.返回对象实例
        return instance;
    }
}
