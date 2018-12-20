package com.journaldev.concurrency;

public class Resource {

    public void doSomething() {
        // DB read, write etc
    }

    public void doLogging() {
        // logging, no need for thread safety
    }
}
