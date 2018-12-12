package com.journaldev.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayListOfStringArray {

    public static void main(String[] args) {

        List<String[]> list = new ArrayList<String[]>();

        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"1", "2", "3", "4"};
        list.add(arr1);
        list.add(arr2);

        for (String[] strArr : list) {
            System.out.println(Arrays.toString(strArr));
        }
    }
}
