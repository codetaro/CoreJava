package com.journaldev.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it = list.iterator();

        /*
         * CopyOnWriteArrayList allows the modification of list,
         * but it doesn't change the iterator and we get same
         * elements as it was on original list.
         */
        while (it.hasNext()) {
            System.out.println("list is:" + list);
            String str = it.next();
            System.out.println(str);
            if (str.equals("2")) list.remove("5");
            if (str.equals("3")) list.add("3 found");
            if (str.equals("4")) list.set(1, "4");
        }
    }
}
