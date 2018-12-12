package com.journaldev.javaforloop;

import java.util.ArrayList;
import java.util.List;

public class JavaForEachLoopExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        for (int i : intArray)
            System.out.println("Java for each loop with array - " + i);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String f : fruits)
            System.out.println("Java for each loop with collection - " + f);
    }
}
