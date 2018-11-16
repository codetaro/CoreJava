package com.journaldev.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        ListIterator<String> namesIterator = names.listIterator();

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
