package com.nuvyra.learn.concepts.designpatterns.factory.interface_approach;

public class ShapeMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();

        Shape squaresShape = shapeFactory.getShape("square");
        squaresShape.draw();

        Shape rectangleShape = shapeFactory.getShape("rectangle");
        rectangleShape.draw();

    }

}
