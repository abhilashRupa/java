package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.priority;

import java.util.stream.IntStream;

public class ThreadPriority1 extends Thread {

  @Override
  public void run() {
    System.out.println("inside ThreadPriority1");

    for (int i = 0; i < 3; i++) {
      System.out.println("inside ThreadPriority1: " + i);
    }
    System.out.println("ThreadPriority1 finished");
  }
}
