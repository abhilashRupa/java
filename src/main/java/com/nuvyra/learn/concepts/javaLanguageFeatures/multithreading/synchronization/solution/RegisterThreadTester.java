package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.solution;

public class RegisterThreadTester {
  public static void main(String[] args) {
    Course course = new Course("CSE", 1);

    RegisterThread registerThread1 = new RegisterThread(course);
    registerThread1.start();

    RegisterThread registerThread2 = new RegisterThread(course);

    registerThread2.start();

    /*expected out some time is*/
    /*
    * Booking successful!
    Booking successful!
    Available seats: -1
    Available seats: 0
    *
    * */
  }
}
