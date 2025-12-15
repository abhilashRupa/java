package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04.exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class TaskRunner {
  public static void main(String[] args) {

    ReentrantLock reentrantLock = new ReentrantLock();
    Task task = new Task(reentrantLock, 1);

    ExecutorService executorService = Executors.newFixedThreadPool(5);

    for (int i = 1; i <= 10; i++) {
      Future<Integer> integerFuture = executorService.submit(task);
      try {
        System.out.println(integerFuture.get());
      } catch (InterruptedException | ExecutionException e) {
        System.out.println(e.getMessage());
      }
    }
    executorService.shutdown();
  }
}
