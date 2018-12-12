package com.journaldev.arrays;

import java.util.Arrays;

public class JavaArrayCopyExample {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] source1 = {1, 2, 3};
        int[] destination = null;
        System.out.println("Source array = " + Arrays.toString(source));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source);
        System.out.println("Copy First five elements of array if available. Result array = "
                + Arrays.toString(destination));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source1);
        System.out.println("Copy First five elements of array if available. Result array = "
                + Arrays.toString(destination));

        destination = copyFullArrayUsingSystem(source);
        System.out.println("Copy full array using System.copyarray() function. Result array = "
                + Arrays.toString(destination));

        destination = copyFullArrayUsingClone(source);
        System.out.println("Copy full array using clone() function. Result array = "
                + Arrays.toString(destination));

        destination = copyFullArrayUsingArrayCopyOf(source);
        System.out.println("Copy full array using Arrays.copyOf() function. Result array = "
                + Arrays.toString(destination));

        destination = copyLastThreeUsingArrayCopyOfRange(source);
        System.out.println("Copy last three elements using Arrays.copyOfRange() function. Result array = "
                + Arrays.toString(destination));
    }

    private static int[] copyFullArrayUsingArrayCopyOf(int[] source) {
        return Arrays.copyOf(source, source.length);
    }

    private static int[] copyLastThreeUsingArrayCopyOfRange(int[] source) {
        // for simplicity, length check is omitted
        return Arrays.copyOfRange(source, source.length - 3, source.length);
    }

    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }

    private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp = new int[source.length];
        System.arraycopy(source, 0, temp, 0, source.length);
        return temp;
    }

    private static int[] copyFirstFiveFieldsOfArrayUsingSystem(int[] source) {
        if (source.length >= 5) {
            int[] temp = new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        } else {
            int[] temp = new int[source.length];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }
    }
}
