package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03.exercise;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

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
    public Integer call() {
        incrementCounter();
        System.out.println("counter value: "+counter +" called by "+Thread.currentThread().getName());
        return counter;
    }

    private void incrementCounter() {
        counter++;
    }
}
