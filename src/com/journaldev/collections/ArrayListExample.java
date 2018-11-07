package com.journaldev.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> letters = new ArrayList<String>();

        letters.add("A");
        letters.add("C");
        letters.add("D");

        letters.add(1, "B");
        System.out.println(letters);

        List<String> list = new ArrayList<String>();
        list.add("E");
        list.add("H");

        letters.addAll(list);
        System.out.println(letters);

        list.clear();

        list.add("F");
        list.add("G");

        letters.addAll(5, list);
        System.out.println(letters);

        System.out.println("Letters list contains 'E'? " + letters.contains("E"));
        System.out.println("Letters list contains 'Z'? " + letters.contains("Z"));

        ArrayList<String> tempList = new ArrayList<>();
        tempList.ensureCapacity(1000);

        String e = letters.get(4);
        System.out.println("Letter at 5th place: " + e);

        System.out.println("tempList is empty? " + tempList.isEmpty());

        System.out.println("First index of D = " + letters.indexOf("D"));
        System.out.println("Last index of D = " + letters.lastIndexOf("D"));

        System.out.println(letters);
        String removed = letters.remove(3);
        System.out.println("After removing '" + removed + "' letters contains " + letters);

        boolean isRemoved = letters.remove("H");
        System.out.println("H removed? " + isRemoved + ". Letters contains " + letters);
        System.out.println("list contains " + list);

        letters.removeAll(list);
        System.out.println(letters);

        list.clear();
        list.add("A");
        list.add("B");
        list.add("C");
        letters.retainAll(list);
        System.out.println("letters elements after retainAll operation: " + letters);

        System.out.println("letters ArrayList size = " + letters.size());

        letters.set(2, "D");
        System.out.println(letters);

        String[] strArray = new String[letters.size()];
        strArray = letters.toArray(strArray);
        System.out.println(Arrays.toString(strArray));
    }
}
