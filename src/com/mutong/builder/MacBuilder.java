package com.mutong.builder;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/23 11:54
 */
public class MacBuilder implements Builder {
    @Override
    public void createDisplay() {
        System.out.println("生产苹果显示器");
    }

    @Override
    public void createBoard() {
        System.out.println("生产苹果主板");
    }
}
