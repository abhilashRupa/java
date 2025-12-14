package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.creation;

public class UploadResultByRunnable implements Runnable {

  @Override
  public void run() {

    System.out.println("uploading result by: " + Thread.currentThread().getName());
  }
}
