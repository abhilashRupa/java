package com.nuvyra.learn.concepts.multithread.step03_synchronization.case03;

/* 
static and instance synchronized does not block each other
*/

public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();

        new Thread(counter::instanceMethod).start();
        new Thread(Counter::staticMethod).start();
    }

}
