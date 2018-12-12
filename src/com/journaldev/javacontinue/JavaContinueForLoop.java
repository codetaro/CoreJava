package com.journaldev.javacontinue;

public class JavaContinueForLoop {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        // we want to process only even entries
        for (int i : intArray) {
            if (i % 2 != 0)
                continue;
            System.out.println("Processing entry " + i);
        }
    }
}
