package com.nuvyra.learn.programming.interview.anz;

class Parent {

    public static void printMessage() {
        System.out.println("Message from Parent");
    }
}


class Child extends Parent {

     public static void printMessage() {
        System.out.println("Message from Child");
    }
}

public class InheritanceCase {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.printMessage();
    }
}