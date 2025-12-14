package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.problem.exercise;

public class Consumer extends Thread{

    DataContainer dataContainer;

    public Consumer(DataContainer dataContainer){
        this.dataContainer = dataContainer;
    }


    @Override
    public void run() {
    System.out.println("Value getting from Data container:" + dataContainer.get());
    }
}
