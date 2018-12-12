package com.journaldev.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String[] strArr = {"1", "2", "3", "4"};
        List<String> strList = new ArrayList<String>();

        // change effect is propogated
        strList = Arrays.asList(strArr);
        System.out.println("Original ArrayList from Arrays.asList()");
        for (String str : strList)
            System.out.print(" " + str);
        strArr[0] = "5";
        System.out.println("\nChange in array effect on ArrayList");
        for (String str : strList)
            System.out.print(" " + str);
        // UnsupportedOperationException
//        strList.add("5");

        // array and arraylist are independent
        strList = new ArrayList<String>();
        Collections.addAll(strList, strArr);
        strList.add("5");
        strArr[0] = "1";
        System.out.println("\nArray to ArrayList using Collections.addAll()");
        for (String str : strList)
            System.out.print(" " + str);
    }
}
