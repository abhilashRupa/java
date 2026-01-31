package com.nuvyra.learn.concepts.multithread.step02_shared_state_race_condition;

public class Counter {

    int count = 0;

    void increment() {
        count++;
    }

}
