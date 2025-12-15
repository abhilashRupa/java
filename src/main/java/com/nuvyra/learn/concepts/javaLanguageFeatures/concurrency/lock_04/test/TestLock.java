package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

    public static void main(String[] args) {
        Counter objCounter = new Counter(new ReentrantLock());
        ExecutorService exService = Executors.newFixedThreadPool(2);
        LockExample lock1 = new LockExample(objCounter, "Thread1");
        LockExample lock2 = new LockExample(objCounter, "Thread2");
        exService.execute(lock1);
        exService.execute(lock2);
        exService.shutdown();
    }
}
