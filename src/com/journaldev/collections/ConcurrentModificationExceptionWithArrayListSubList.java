package com.journaldev.collections;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionWithArrayListSubList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("PHP");
        names.add("SQL");
        names.add("Angular 2");

        List<String> first2Names = names.subList(0, 2);

        System.out.println(names + " , " + first2Names);

        names.set(1, "JavaScript");

        System.out.println(names + " , " + first2Names);

        names.add("NodeJS");
//        System.out.println(names + " , " + first2Names);
    }
}
