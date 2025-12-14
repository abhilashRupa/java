package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.priority;

public class ThreadPriorityTester {
    public static void main(String[] args){
        ThreadPriority1 priority1 = new ThreadPriority1();
        ThreadPriority2 priority2 = new ThreadPriority2();

        priority1.setPriority(Thread.MIN_PRIORITY); //should be more than 0
        priority2.setPriority(Thread.MAX_PRIORITY); //should be less than 11
        priority1.start();
        priority2.start();
    }
}
