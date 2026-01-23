package com.nuvyra.learn.concepts.java8.default_methods;

public class MyClass implements InterfaceA{

    @Override
    public void abstractMethod() {
        System.out.println("This is Abstract method implementation");
    }
    
    @Override
    public void show(){
        System.out.println("This is the overrode default implementation of the Interface A method");
    }

}
