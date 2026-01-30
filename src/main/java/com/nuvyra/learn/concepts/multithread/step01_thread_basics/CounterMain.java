package com.nuvyra.learn.concepts.multithread.step01_thread_basics;

public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter, "Worker-1");
        Thread thread2 = new Thread(counter, "Worker-2");
        Thread thread3 = new Thread(counter, "Worker-3");

        thread1.start();
        thread2.start();
        thread3.start();

        // using java 8 approach


        System.out.println("\n using lambda");

        Runnable runnableCounter = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread name: " + Thread.currentThread().getName() + " :: prints: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread4 = new Thread(runnableCounter, "Worker-4");
        Thread thread5 = new Thread(runnableCounter, "Worker-5");
        Thread thread6 = new Thread(runnableCounter, "Worker-6");

        thread4.start();
        thread5.start();
        thread6.start();

    }

}
