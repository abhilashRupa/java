package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03.exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskRunner {
  public static void main(String[] args) {
    Task task1 = new Task(1);
    Task task2 = new Task(2);

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    Future<Integer> taskOutput1 = executorService.submit(task1);
    Future<Integer> taskOutput2 = executorService.submit(task2);
    try {
      System.out.println(taskOutput1.get());
      System.out.println(taskOutput2.get());

    } catch (InterruptedException | ExecutionException e) {
      System.out.println(e.getMessage());
      throw new RuntimeException(e);
    }
    executorService.shutdown();
  }
}
