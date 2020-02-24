package com.mutong.Proxy;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/24 11:28
 */
public class ImageProxy implements Image {
    private HighResolutionImage highResolutionImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        if (highResolutionImage == null){
            highResolutionImage = new HighResolutionImage(fileName);
        }
        highResolutionImage.showImage();
    }
}
