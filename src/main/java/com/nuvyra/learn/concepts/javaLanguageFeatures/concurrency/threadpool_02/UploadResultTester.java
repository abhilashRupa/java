package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.threadpool_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UploadResultTester {
  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    int numberOfUploadTask = 3;

    for (int i = 1; i <= numberOfUploadTask; i++) {
      UploadResult uploadResult = new UploadResult("UploadResult " + i);
      executorService.execute(uploadResult);
    }
    executorService.shutdown();
    if (!executorService.isTerminated()) {}
    System.out.println("Finished all threads");
  }
}
