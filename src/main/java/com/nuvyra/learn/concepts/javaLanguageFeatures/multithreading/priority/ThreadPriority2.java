package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.priority;

public class ThreadPriority2 extends Thread {

  @Override
  public void run() {
    System.out.println("inside ThreadPriority2");
    for (int i = 0; i < 3; i++) {
      System.out.println("inside ThreadPriority2: " + i);
    }

    System.out.println("ThreadPriority2 finished");
  }
}
