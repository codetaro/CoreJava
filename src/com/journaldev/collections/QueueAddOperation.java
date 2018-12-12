package com.journaldev.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueAddOperation {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        System.out.println(queue.add("one"));
        System.out.println(queue.add("two"));
        System.out.println(queue);
        System.out.println(queue.add("three"));
        System.out.println(queue);
    }
}
