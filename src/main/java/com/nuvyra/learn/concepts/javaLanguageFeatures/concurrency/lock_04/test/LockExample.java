package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04.test;

public class LockExample implements Runnable{
    private String threadName;
    private Counter ctr;
    public LockExample (Counter obj, String name){
        ctr = obj;
        threadName = name;
    }
    @Override
    public void run() {
        int newVal = ctr.increment();
        System.out.println("counter value in"+ threadName + " is:" + newVal);
    }
}
