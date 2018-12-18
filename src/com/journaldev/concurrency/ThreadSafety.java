package com.journaldev.concurrency;

public class ThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Processing count=" + pt.getCount());
    }
}

class ProcessingThread implements Runnable {

    // dummy object variable for synchronization
    private Object mutex = new Object();
    private int count;

    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            processSomething(i);
            // using synchronized block to read, increment and update count value synchronously
            synchronized (mutex) {
                count++;
            }
        }
    }

    private void processSomething(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}