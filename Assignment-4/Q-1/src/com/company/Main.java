package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ThreadSafeLinkList threadSafeLinkList = new ThreadSafeLinkList();
        for(int val = 0; val < 3; val++) {
            service.submit(new Work(threadSafeLinkList, val));
        }
        service.shutdown();
        try {
            service.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

