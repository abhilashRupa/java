package com.nuvyra.learn.concepts.multithread.step03_synchronization;

public class CounterMethod implements Runnable {

    int total = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    synchronized void increment() {
        total++;
    }

}
