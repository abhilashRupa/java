package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.executorFramework_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UploadResultTester {
  public static void main(String[] args) {
    UploadResult uploadResult = new UploadResult();

    ExecutorService executor = Executors.newSingleThreadExecutor();

    executor.execute(uploadResult);
  }
}
