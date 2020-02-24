package com.mutong.builder;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/23 11:56
 */
public class WinBuilder implements Builder {
    @Override
    public void createDisplay() {
        System.out.println("生产微软显示器");
    }

    @Override
    public void createBoard() {
        System.out.println("生产微软主板");

    }
}
