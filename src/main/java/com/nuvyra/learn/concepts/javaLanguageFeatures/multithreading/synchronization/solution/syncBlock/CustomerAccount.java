package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.solution.syncBlock;

import java.util.Random;

public class CustomerAccount {
    private static String accountId;
    private Random rnd = new Random();
    public CustomerAccount(){
        synchronized (this) {
            if(accountId == null){
                accountId = "ACC0001" + Math.abs(rnd.nextInt());
            }
        }
    }
    public String getAccountId(){
        return accountId;
    }
}
