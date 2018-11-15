package com.journaldev.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapMergeExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put(null, "10");
        map.put("10", null);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // merge throw NullPointerException if key or value is null
            if (key != null && value !=null)
                map.merge(key,value,(k,v) -> {return k+v;});
        }
        System.out.println(map);

        // key not present
        map.merge("5","5", (k,v) -> {return k+v;});
        System.out.println(map);

        // method return null, so remove
        map.merge("1","1", (k,v) -> {return null;});
        System.out.println(map);
    }
}
