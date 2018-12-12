package com.journaldev.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListToStreamDemo {

    public static void main(String[] args) {
        List<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        // convert List to stream
        numbersList.stream().forEach(System.out::println);
    }
}
