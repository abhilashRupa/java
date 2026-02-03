package com.nuvyra.learn.concepts.multithread.step03_synchronization;

public class CounterBlock {
     
    int count = 0;

    void increment(){
        synchronized (this){
            count++;
        }
    }

}
