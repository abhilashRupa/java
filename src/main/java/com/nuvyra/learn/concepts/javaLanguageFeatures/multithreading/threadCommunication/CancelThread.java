package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.threadCommunication;

public class CancelThread extends Thread {

    Course c;

    public CancelThread(Course c){
        this.c = c;
    }


    @Override
    public void run() {
        c.cancelSeat();
    }
}
