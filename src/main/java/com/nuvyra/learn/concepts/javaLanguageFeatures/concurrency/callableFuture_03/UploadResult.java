package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03;

import java.util.concurrent.Callable;

public class UploadResult implements Callable<Boolean> {

  private String taskName;

  public UploadResult(String taskName) {
    this.taskName = taskName;
  }

  @Override
  public Boolean call() throws Exception {
    System.out.println(Thread.currentThread().getName() + " (start) " + taskName);

    Boolean returnValue = null;

    try {
      Thread.sleep(2000);
      returnValue = Boolean.TRUE;
    } catch (Exception e) {
      returnValue = Boolean.FALSE;
    }
    System.out.println(Thread.currentThread().getName() + " (end) " + taskName);
    return returnValue;
  }
}
