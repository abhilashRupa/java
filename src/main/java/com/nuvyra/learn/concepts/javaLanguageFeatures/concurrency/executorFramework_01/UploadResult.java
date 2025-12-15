package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.executorFramework_01;

public class UploadResult implements Runnable {

  @Override
  public void run() {

    System.out.println("uploading result by: " + Thread.currentThread().getName());
  }
}
