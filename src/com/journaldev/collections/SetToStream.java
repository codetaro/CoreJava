package com.journaldev.collections;

import java.util.HashSet;
import java.util.Set;

public class SetToStream {

    public static void main(String[] args) {
        Set<String> vowelsSet = new HashSet<>();

        vowelsSet.add("a");
        vowelsSet.add("e");
        vowelsSet.add("i");
        vowelsSet.add("o");
        vowelsSet.add("u");

        // convert set to stream
        vowelsSet.stream().forEach(System.out::println);
    }
}
