package com.nuvyra.learn.concepts.multithread.step03_synchronization.case02_2ThreadDiffObj;

/* 
If two threads use different object, object lock does not works
*/

public class CounterMain {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        new Thread(counter1::increment, "T1").start();
        new Thread(counter2::increment, "T2").start();


    }



}
