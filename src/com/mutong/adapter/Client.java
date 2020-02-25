package com.mutong.adapter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/25 10:49
 * @time_complexity: O()
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
