package com.journaldev.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetToListExample {

    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");

        List<String> vowelsList = new ArrayList<>(vowels);
        System.out.println("15 " + vowels);
        System.out.println("16 " + vowelsList);

        vowels.add("o");
        vowelsList.add("a");
        vowelsList.add("u");
        System.out.println("20 " + vowels);
        System.out.println("21 " + vowelsList);

        vowels = new HashSet<>(vowelsList);
        System.out.println("24 " + vowels);
    }
}
