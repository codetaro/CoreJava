package com.journaldev.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BiDirectinalListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        ListIterator<String> listIterator = names.listIterator();

        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
