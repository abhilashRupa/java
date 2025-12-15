package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UploadResultTester {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    UploadResult uploadResult = new UploadResult("Batch 1");

    Future<Boolean> uploadResultStatus = executorService.submit(uploadResult);

    executorService.shutdown();

    try {
      System.out.println(uploadResultStatus.get());
    } catch (InterruptedException | ExecutionException e) {
      System.out.println(e.getMessage());
      throw new RuntimeException(e);
    }
  }
}
