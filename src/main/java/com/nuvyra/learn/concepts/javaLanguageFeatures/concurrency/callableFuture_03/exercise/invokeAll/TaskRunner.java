package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03.exercise.invokeAll;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskRunner {
  public static void main(String[] args) {
    Task task1 = new Task(1);
    Task task2 = new Task(2);

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    List<Task> taskList = Arrays.asList(task1, task2);
    try {
      List<Future<Integer>> taskoutput = executorService.invokeAll(taskList);
      taskoutput.forEach(
          integerFuture -> {
            try {
              System.out.println(integerFuture.get());
            } catch (InterruptedException | ExecutionException e) {
              System.out.println(e.getMessage());
            }
          });
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }

    executorService.shutdown();
  }
}
