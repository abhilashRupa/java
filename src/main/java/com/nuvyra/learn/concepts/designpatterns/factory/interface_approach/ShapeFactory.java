package com.nuvyra.learn.concepts.designpatterns.factory.interface_approach;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }else if("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else {
            return null;
        }
    }

}
