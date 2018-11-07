package com.journaldev.collections;

import java.util.LinkedList;
import java.util.List;

public class JavaArrayToLinkedListDemo {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numberList = new LinkedList<>();
        for (Integer s : numbers) {
            numberList.add(s);
        }
        System.out.println(numberList);
    }
}
