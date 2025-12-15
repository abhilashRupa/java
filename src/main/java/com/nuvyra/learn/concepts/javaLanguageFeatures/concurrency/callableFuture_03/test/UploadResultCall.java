package com.nuvyra.learn.concepts.javaLanguageFeatures.concurrency.callableFuture_03.test;

import java.util.concurrent.Callable;

public class UploadResultCall implements Callable<Boolean> {
    private int threadNo;
    public UploadResultCall(int number) {
        threadNo = number;
    }
    @Override
    public Boolean call() throws Exception {
        Boolean retValue = processResult();
        if (retValue){
            System.out.println("Upload Successful!");
        }else{
            System.out.println("Upload failed!");
        }
        return retValue;
    }
    private Boolean processResult(){
        //dummy implementation for processing
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        //dummy implementation for return value
        if(threadNo % 2 ==0 )
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
}
