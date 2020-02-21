package com.mutong.factory.singfactory;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/7 17:24
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
