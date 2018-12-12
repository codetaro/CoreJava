package com.journaldev.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekOperation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");

        System.out.println(queue.peek());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue.peek());
    }
}
