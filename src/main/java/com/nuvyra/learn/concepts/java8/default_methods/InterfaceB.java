package com.nuvyra.learn.concepts.java8.default_methods;

public interface InterfaceB {

    void abstractMethod();

     default void show(){
        System.out.println("This is the default implementation of the Interface B method");
    }

}
