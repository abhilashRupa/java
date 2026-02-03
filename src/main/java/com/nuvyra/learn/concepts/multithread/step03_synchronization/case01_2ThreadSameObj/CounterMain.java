package com.nuvyra.learn.concepts.multithread.step03_synchronization.case01_2ThreadSameObj;


/* 
If two threads use same object, object lock works
*/

public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();

        new Thread(counter::increment, "T1").start();
        new Thread(counter::increment, "T2").start();

    }

}
