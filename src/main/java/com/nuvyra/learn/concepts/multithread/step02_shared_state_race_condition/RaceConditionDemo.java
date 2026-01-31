package com.nuvyra.learn.concepts.multithread.step02_shared_state_race_condition;

public class RaceConditionDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {

            for (int i = 0 ; i < 1000 ; i++){
                counter.increment();
            }    
        };

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);


    }

}
