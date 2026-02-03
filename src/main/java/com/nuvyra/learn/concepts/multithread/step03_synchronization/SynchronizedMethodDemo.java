package com.nuvyra.learn.concepts.multithread.step03_synchronization;

public class SynchronizedMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        CounterMethod counter = new CounterMethod();

        Thread t1 = new Thread(counter, "worker-1");
        Thread t2 = new Thread(counter, "worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final total: "+ counter.total);
    }
}
