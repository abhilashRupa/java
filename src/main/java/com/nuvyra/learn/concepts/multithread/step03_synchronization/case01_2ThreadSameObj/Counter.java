package com.nuvyra.learn.concepts.multithread.step03_synchronization.case01_2ThreadSameObj;

public class Counter {

    synchronized void increment(){
        System.out.println(Thread.currentThread().getName() + " entered.. ");
sleep();
        System.out.println(Thread.currentThread().getName() + " existed.. ");
    }

    private void sleep() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
