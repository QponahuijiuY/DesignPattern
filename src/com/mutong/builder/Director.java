package com.mutong.builder;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/23 11:54
 */
public class Director {
    Builder abstractBuilder = null;

    public Director(Builder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }
}
