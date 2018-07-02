package com.journaldev.java;

public class JavaContinueWhileLoop {

    public static void main(String[] args) {
        int[] intArray = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i = 0;
        while (i < 10) {

            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println("Processing Entry " + intArray[i]);
            i++;
        }
    }
}
