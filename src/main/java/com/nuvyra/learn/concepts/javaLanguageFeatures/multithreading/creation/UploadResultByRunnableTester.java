package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.creation;

public class UploadResultByRunnableTester {

  public static void main(String[] args) throws InterruptedException {
    UploadResultByRunnable byRunnable1 = new UploadResultByRunnable();

    Thread t1 = new Thread(byRunnable1);
    Thread t2 = new Thread(byRunnable1);
    Thread t3 = new Thread(byRunnable1);
    Thread t4 = new Thread(byRunnable1);
    Thread t5 = new Thread(byRunnable1);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    /*java 1.8 approach*/

    Thread.sleep(2000);
    System.out.println("new 1.8 approach");

    Runnable runnable =
        () -> {
          System.out.println(
              "1.8 approach of uploading result: " + Thread.currentThread().getName());
        };

    Thread newT1 = new Thread(runnable);
    Thread newT2 = new Thread(runnable);
    Thread newT3 = new Thread(runnable);
    Thread newT4 = new Thread(runnable);

    newT1.start();
    newT2.start();
    newT3.start();
    newT4.start();
  }
}
