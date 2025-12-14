package com.nuvyra.learn.concepts.javaLanguageFeatures.multithreading.synchronization.solution.syncBlock;

public class CreateAccountTetser {

    /*
    *
    * this code needs to be fixed
    *
    * */

    public static void main(String[] args){
        Runnable task = () -> {
            // Each thread creates a new CustomerAccount instance
            CustomerAccount account = new CustomerAccount();

            // Print the result
            System.out.println(Thread.currentThread().getName() +
                    " | Instance Hash: " + System.identityHashCode(account) +
                    " | Retrieved ID: " + account.getAccountId());
        };

        // 3. Create and start a new Thread with the task
        Thread thread1 = new Thread(task, "Worker-Thread-1" );
        thread1.start();

        Thread thread2 = new Thread(task, "Worker-Thread-2" );
        thread2.start();
    }
}
