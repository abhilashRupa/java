package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.ThreadGroup;

public class ThreadGroupCreation {
    public static void main(String[] args){

        ThreadGroup threadGroup = new ThreadGroup("publisher");

        Thread thread = new Thread(threadGroup, "publisher1");
        Thread thread1= new Thread(threadGroup, "publisher2");
        Thread thread2 = new Thread(threadGroup, "publisher3");
        threadGroup.activeCount();
        threadGroup.list();
        threadGroup.getParent();
        threadGroup.activeGroupCount();
        threadGroup.getName();
        threadGroup.interrupt();


    }
}
