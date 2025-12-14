package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.problem.exercise;

public class Producer extends Thread {

  DataContainer dataContainer;
  int data;

  public Producer(DataContainer dataContainer, int data) {
    this.dataContainer = dataContainer;
    this.data = data;
  }

  @Override
  public void run() {
    System.out.println("Value putting in Data container:" + data);
    dataContainer.put(data);
  }
}
