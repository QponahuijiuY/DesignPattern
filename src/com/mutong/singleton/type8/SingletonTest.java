package com.mutong.singleton.type8;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/5 13:53
 */
public class SingletonTest {
    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.hello();
    }

}
enum Singleton{
    INSTANCE;

    public void hello(){
        System.out.println("hello world");
    }
}