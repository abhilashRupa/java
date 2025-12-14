package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.creation;

public class ThreadMethodsTryoutTester {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("main thread start");
    ThreadMethodsTryout methodsTryout = new ThreadMethodsTryout();
    methodsTryout.start();
    System.out.println(methodsTryout.isAlive());
    methodsTryout.join();
    System.out.println(methodsTryout.isAlive());
    Thread.sleep(2000);
    System.out.println("main thread end");

  }
}
