package com.journaldev.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

    public static void main(String[] args) {
//        testCopyOnWriteArrayList();
        testConcurrentHashMap();
    }

    private static void testCopyOnWriteArrayList() {
        //        List<String> myList = new ArrayList<String>();
        List<String> myList = new CopyOnWriteArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals("3")) {
                myList.remove("4");
                myList.add("6");
                myList.add("7");
            }
        }
        System.out.println("List Size:" + myList.size());
    }

    private static void testConcurrentHashMap() {
        //        Map<String, String> myMap = new HashMap<String, String>();
        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println("Map Value:" + myMap.get(key));
            if (key.equals("3")) {
                myMap.remove("2");
                myMap.put("4", "4");
                myMap.put("5", "5");
            }
        }
        System.out.println("Map Size:" + myMap.size());
    }
}