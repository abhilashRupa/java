package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.problem.exercise;

public class SyncronizationProblemExercise {

    public static void main(String[] args){
        DataContainer dataContainer = new DataContainer();
        Producer producer = new Producer(dataContainer, 1);
        producer.start();
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        Consumer consumer = new Consumer(dataContainer);
        consumer.start();
    }

}
