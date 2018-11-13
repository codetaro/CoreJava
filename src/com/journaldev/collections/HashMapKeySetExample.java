package com.journaldev.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapKeySetExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");

        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        map.put("4","4");
        System.out.println(keySet);

        keySet.remove("1");
        System.out.println(map);

        // keySet is not backed by map anymore
        keySet = new HashSet<>(map.keySet());
        map.put("5","5");
        System.out.println(keySet);

    }
}
