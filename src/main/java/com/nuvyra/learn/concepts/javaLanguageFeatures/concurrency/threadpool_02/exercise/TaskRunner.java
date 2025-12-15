package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.threadpool_02.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskRunner {

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Task task = new Task(1);
        Task task1 = new Task(2);

        executorService.execute(task1);
        executorService.execute(task);

        executorService.shutdown();


    }

}
