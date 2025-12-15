package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04.exercise;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Callable<Integer> {

    private static int counter;
    private ReentrantLock reentrantLock;

    public Task(ReentrantLock reentrantLock, int counter){
        this.reentrantLock = reentrantLock;
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
        this.reentrantLock.lock();
        counter++;
        this.reentrantLock.unlock();
    }
}
