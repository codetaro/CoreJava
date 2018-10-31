package com.journaldev.arrays;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToArrayExample {

    public static void main(String[] args) {
        String line = "My name is Pankaj";
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));

        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(line);
        System.out.println(Arrays.toString(words));
    }
}
