package com.mutong.builder;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/23 11:57
 */
public class Test {
    public static void main(String[] args) {

        Builder builder = new MacBuilder();
        builder.createBoard();
        builder.createDisplay();

        Builder builder1 = new WinBuilder();
        builder1.createDisplay();
        builder1.createBoard();
    }
}
