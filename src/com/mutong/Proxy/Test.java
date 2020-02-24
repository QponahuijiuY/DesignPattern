package com.mutong.Proxy;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/24 11:33
 */
public class Test {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.jpg");
        image.showImage();
    }
}
