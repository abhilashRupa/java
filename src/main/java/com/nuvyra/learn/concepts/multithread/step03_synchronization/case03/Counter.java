package com.nuvyra.learn.concepts.multithread.step03_synchronization.case03;

public class Counter {

    synchronized void instanceMethod() {
        System.out.println("instance start");
        sleep();
        System.out.println("instance end");
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static synchronized void staticMethod() {

       System.out.println("static start");
       sleep();
       System.out.println("static end");

    }

}
