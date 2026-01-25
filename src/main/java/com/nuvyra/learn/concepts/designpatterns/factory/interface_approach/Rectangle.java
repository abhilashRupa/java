package com.nuvyra.learn.concepts.designpatterns.factory.interface_approach;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
