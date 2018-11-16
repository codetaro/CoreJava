package com.journaldev.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExternalIteratorDemo {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        Iterator<String> namesIterator = names.iterator();

        // Example-1:-
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        // Example-2:-
        for (String name : names) {
            System.out.println(name);
        }
    }
}
