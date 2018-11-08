package com.journaldev.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCommonOperations {

    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();

        vowels.add("A");
        vowels.add("E");
        vowels.add("I");

        System.out.println(vowels);

        Set<String> set = new HashSet<>();
        set.add("O");
        set.add("U");

        vowels.addAll(set);
        System.out.println(vowels);

        set.clear();

        System.out.println("letters set size = " + vowels.size());

        vowels.clear();
        vowels.add("E");vowels.add("E");vowels.add("I");vowels.add("O");
        System.out.println("Given set contains E element or not? " + vowels.contains("E"));
    }
}
