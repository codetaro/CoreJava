package com.journaldev.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcurrentModificationExceptionExample {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Processing " + fruit);

            // correct way of structural modification of Set
            if ("Orange".equals(fruit)) iterator.remove();
        }
        System.out.println("fruits set after iteration = " + fruits);
    }
}
