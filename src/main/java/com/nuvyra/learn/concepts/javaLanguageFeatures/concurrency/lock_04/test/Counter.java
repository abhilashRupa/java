package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04.test;

import java.util.concurrent.locks.Lock;

public class Counter {

    private Lock lock;
    private int count;
    public Counter(Lock obj){
        lock = obj;
    }
    public int increment(){
        lock.lock();
        count++;
        lock.unlock();
        return count;
    }

}
