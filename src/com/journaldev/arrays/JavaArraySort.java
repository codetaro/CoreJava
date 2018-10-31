package com.journaldev.arrays;

import java.util.Arrays;

public class JavaArraySort {

    public static void main(String[] args) {
        int[] intArr = {1, 4, 2, 6, 3};
        String[] strArr = {"E", "A", "U", "O", "I"};

        Arrays.sort(intArr);  // natural ascending order
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }
}
