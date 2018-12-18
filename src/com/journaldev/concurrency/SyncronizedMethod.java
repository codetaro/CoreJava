package com.journaldev.concurrency;

public class SyncronizedMethod {

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6"};
        HashMapProcessor hmp = new HashMapProcessor(arr);
    }
}

class HashMapProcessor implements Runnable {

    private String[] strArr = null;

    public HashMapProcessor(String[] strArr) {
        this.strArr = strArr;
    }

    public String[] getMap() {
        return strArr;
    }

    @Override
    public void run() {
        processArr(Thread.currentThread().getName());
    }

    private void processArr(String name) {
        for (int i = 0; i < strArr.length; i++) {
            // process data and append thread name
            processSomething(i);
            addThreadName(i, name);
        }
    }
}