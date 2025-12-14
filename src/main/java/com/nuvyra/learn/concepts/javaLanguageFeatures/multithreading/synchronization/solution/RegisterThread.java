package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.solution;

public class RegisterThread extends Thread {

    Course c;

    public RegisterThread(Course c){
        this.c = c;
    }

    @Override
    public void run() {
        c.registerForCourse(1);
    }
}
