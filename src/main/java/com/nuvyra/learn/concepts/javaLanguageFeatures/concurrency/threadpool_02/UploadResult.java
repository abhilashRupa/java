package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.threadpool_02;

public class UploadResult implements Runnable{

    private String taskName;

    public UploadResult(String taskName) {
        this.taskName = taskName;
    }


    @Override
    public void run() {

    System.out.println(Thread.currentThread().getName() +" (start) "+ taskName);
    try{
        Thread.sleep(2000);
    }catch (InterruptedException exception){
      System.out.println(exception.getMessage());
    }
    System.out.println(Thread.currentThread().getName() +" (end) "+ taskName);
  }
}
