package com.nuvyra.learn.concepts.java8.default_methods;

/* 

This class demonstrate when a class implements multiple interfaces which has default methods,
how to call the specific class default method.

*/

public class DefaultMethodMultipleInheritance implements InterfaceA, InterfaceB {

    @Override
    public void abstractMethod() {
        System.out.println("This is Abstract method implementation");

    }

    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("This is the overrode default implementation of the Interface A method");
    }

    

}
