package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.threadCommunication;

public class RegisterThreadTester {
  public static void main(String[] args) throws InterruptedException {
    Course course = new Course("CSE", 1);

    RegisterThread registerThread1 = new RegisterThread(course);
    registerThread1.start();

    RegisterThread registerThread2 = new RegisterThread(course);

    registerThread2.start();

    Thread.sleep(2000);

    CancelThread cancelThread = new CancelThread(course);
    cancelThread.start();



  }
}
