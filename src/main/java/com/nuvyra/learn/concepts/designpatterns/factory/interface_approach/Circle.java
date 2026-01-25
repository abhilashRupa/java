package com.nuvyra.learn.concepts.designpatterns.factory.interface_approach;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
