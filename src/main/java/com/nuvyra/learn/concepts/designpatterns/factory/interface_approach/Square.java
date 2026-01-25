package com.nuvyra.learn.concepts.designpatterns.factory.interface_approach;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }

}
