package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.creation;

public class UploadResultByThreadTester {

    public static void main(String[] args){
        UploadResultByThread uploadResultByThread1 = new UploadResultByThread();
        uploadResultByThread1.setName("t1");
        UploadResultByThread uploadResultByThread2 = new UploadResultByThread();
        uploadResultByThread2.setName("t2");
        UploadResultByThread uploadResultByThread3 = new UploadResultByThread();
        uploadResultByThread3.setName("t3");

        uploadResultByThread1.start();
        uploadResultByThread2.start();
        uploadResultByThread3.start();


    }

}
