package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.lock_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class UploadResultWithLockTester {

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        int numberOfUploadTask = 3;

        ReentrantLock reentrantLock = new ReentrantLock();
        UploadResultWithLock uploadResultWithLock = new UploadResultWithLock(reentrantLock);

        for (int i =1 ; i <= numberOfUploadTask ; i++){
            executorService.submit(uploadResultWithLock);
        }
        executorService.shutdown();
    }

}
