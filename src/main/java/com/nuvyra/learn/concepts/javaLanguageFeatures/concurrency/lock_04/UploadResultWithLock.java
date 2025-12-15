package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04;

/*
 * We have a requirement to count the number of uploads.
 *
 * */

import java.util.concurrent.locks.ReentrantLock;

public class UploadResultWithLock implements Runnable {

  private ReentrantLock reentrantLock;
  private int resultCount;

  public UploadResultWithLock(ReentrantLock reentrantLock) {
    this.reentrantLock = reentrantLock;
  }

  @Override
  public void run() {
    System.out.println(
        Thread.currentThread().getName() + " (start) - result uploaded: " + resultCount);
    try {
      reentrantLock.lock();
      resultCount++;
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    } finally {
      reentrantLock.unlock();
    }
    System.out.println(
        Thread.currentThread().getName() + " (end) - result uploaded: " + resultCount);
  }
}
