package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.threadpool_02.exercise;

public class Task implements Runnable {

    private int counter;

    public Task(int counter){
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        incrementCounter();
    System.out.println("counter value: "+counter +" called by "+Thread.currentThread().getName());
    }

    private void incrementCounter() {
        counter++;
    }
}
