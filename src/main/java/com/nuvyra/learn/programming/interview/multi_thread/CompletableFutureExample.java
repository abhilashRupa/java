package com.nuvyra.learn.programming.interview.multi_thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/* 
Deloitte: 
Java program to demonstrate CompletableFuture

*/

public class CompletableFutureExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        demo1();
        demoChainingExample();

    }

    private static void demo1() throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            return "Hello World";
        });

        System.out.println("main thead not blocked");

        String out = completableFuture.get();
        System.out.println("result from completableFuture: " + out);
    }

     private static void demoChainingExample() {

        System.out.println("\n Chaining Tasks example");

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World")
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println); // Consume the final result (returns Void)

        // Wait for the entire pipeline to complete
        completableFuture.join(); // join() is similar to get(), but doesn't throw checked exceptions

    }

}
