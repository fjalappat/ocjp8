package com.java.ob2_concurrency.item3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class AsyncProgram {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        CompletableFuture.runAsync(()-> System.out.println("Francis"));
        System.out.println(getUsersDetail().get());

    }

    static CompletableFuture<String> getUsersDetail() {
        return CompletableFuture.supplyAsync(() -> {
            return "User Name: Francis Jose Alappat";
        });
    }
}
