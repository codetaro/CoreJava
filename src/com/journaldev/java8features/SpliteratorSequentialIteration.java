package com.journaldev.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorSequentialIteration {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        Spliterator<String> namesSpliterator = names.spliterator();

        namesSpliterator.forEachRemaining(System.out::println);
    }
}
