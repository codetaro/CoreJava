package com.journaldev.concurrency;

public class HeavyWorkRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Doing heavy processing - START " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END " + Thread.currentThread().getName());
    }

    /**
     * Get database connection, delete unused data from DB
     *
     * @throws InterruptedException
     */
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
