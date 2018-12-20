package com.journaldev.concurrency;

public class SynchronizedLockExample implements Runnable {

    private Resource resource;

    public SynchronizedLockExample(Resource r) {
        this.resource = r;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.doSomething();  // need for thread safety
        }
        resource.doLogging();        // no need for thread safety
    }
}
