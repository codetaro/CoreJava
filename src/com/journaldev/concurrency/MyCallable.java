package com.journaldev.concurrency;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    private long waitTime = 1 * 1000;

    // default constructor
    public MyCallable() {
    }

    public MyCallable(long timeInSeconds) {
        this.waitTime = timeInSeconds * 1000;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        // return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        // Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        // create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        // Create MyCallable instance
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 100; i++) {
            // submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            // add Future to the list, we can get return value using Future
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                /* print the return value of Future, notice the output delay in console
                because Future.get() waits for task to get */
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        // shut down the executor service now
        executor.shutdown();
    }
}
