package com.mutong.Proxy;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/24 11:27
 */
public class HighResolutionImage implements Image {
    private String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void showImage() {
        System.out.println("showImage " + fileName);
    }
}
