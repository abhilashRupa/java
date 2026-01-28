package com.nuvyra.learn.programming.interview.anz;


/* 

predict the output

*/

public class MethodOverloadingDemoCase {

    public static void main(String[] args) {
        printValue(null);
        
    }

    public static void printValue(String s){
        System.out.println("String method invoked: " + s);
    }

    public static void printValue(Object o){
        System.out.println("Object method invoked: "+ o);
    }

}
