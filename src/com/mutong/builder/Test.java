package com.mutong.builder;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/23 11:57
 */
public class Test {
    public static void main(String[] args) {

        Director director = new Director(new MacBuilder());
        director.abstractBuilder.createBoard();
        director.abstractBuilder.createDisplay();


        Builder builder1 = new WinBuilder();
        builder1.createDisplay();
        builder1.createBoard();
    }
}
