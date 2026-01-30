package com.nuvyra.learn.concepts.multithread.step01_thread_basics;

public class Counter implements Runnable {

    @Override
    public void run() {

        for(int i = 0 ; i <=5 ; i++){
            System.out.println("Thread name: "+ Thread.currentThread().getName() + " :: prints: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
