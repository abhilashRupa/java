package com.nuvyra.learn.concepts.multithread.step03_synchronization;

public class SynchronizedBlockDemo {

    public static void main(String[] args) throws InterruptedException {

        CounterBlock counterBlock = new CounterBlock();

        Runnable counterRunnable = () -> {

            for (int i = 0; i < 1000; i++) {
                counterBlock.increment();

            }
        };

        Thread t1 = new Thread(counterRunnable, "thread-1");
        Thread t2 = new Thread(counterRunnable, "thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final output: " + counterBlock.count);

    }

}
