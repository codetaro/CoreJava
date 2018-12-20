package com.journaldev.concurrency;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        // schedule to run after sometime
        System.out.println("Current Time = " + new Date());

        // #1.
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1 * 1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
        }

        // #2.schedule task to execute at fixed rate
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1 * 1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            scheduledThreadPool.scheduleAtFixedRate(worker, 0, 10, TimeUnit.SECONDS);
        }

        // #3.
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1 * 1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            scheduledThreadPool.scheduleWithFixedDelay(worker, 0, 1, TimeUnit.SECONDS);
        }

        // add some delay to let some threads spawn by scheduler
        Thread.sleep(30 * 1000);

        scheduledThreadPool.shutdown();
        while (!scheduledThreadPool.isTerminated()) {
            // wait for all tasks to finish
        }
        System.out.println("Finished all threads");
    }
}
