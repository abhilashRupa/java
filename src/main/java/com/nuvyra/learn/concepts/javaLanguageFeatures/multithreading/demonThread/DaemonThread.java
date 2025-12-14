package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.demonThread;

public class DaemonThread extends Thread {

  public DaemonThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println(getName() + " is demon thread");
    } else {
      System.out.println(getName() + " is not demon thread");
    }
  }

  public static void main(String[] args){
    DaemonThread thread1 = new DaemonThread("t1");
    DaemonThread thread2 = new DaemonThread("t2");
    DaemonThread thread3 = new DaemonThread("t3");

    thread1.setDaemon(true);

    thread1.start();
    thread2.start();

    thread3.setDaemon(true);
    thread3.start();


  }
}
