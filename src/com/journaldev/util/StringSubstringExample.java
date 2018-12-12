package com.journaldev.util;

public class StringSubstringExample {

    public static void main(String[] args) {
        String str = "www.journaldev.com";
        System.out.println("Last 4 char String: " + str.substring(str.length() - 4));
        System.out.println("First 4 char String: " + str.substring(0, 4));
        System.out.println("website name: " + str.substring(4, 14));
    }
}
