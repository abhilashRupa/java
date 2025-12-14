package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.creation;

public class UploadResultByThread extends Thread {

  @Override
  public void run() {
    System.out.println("uploading result by: "+Thread.currentThread().getName());
  }
}
