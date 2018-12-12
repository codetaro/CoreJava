package com.journaldev.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListGenericsDemo {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");
//        names.add(2011);

        System.out.println("LinkedList content: " + names);
        System.out.println("LinkedList size: " + names.size());
    }
}
