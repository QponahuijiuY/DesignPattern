package com.mutong.adapter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-12 13:40
 * @time_complexity: O()
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter();

        computer.net(adapter);
    }
}
