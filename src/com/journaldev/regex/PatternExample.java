package com.journaldev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("MxxY");
        System.out.println("Input String matches regex - " + matcher.matches());

        // bad regular expression
//        pattern = Pattern.compile("*xx*");

        String str = "bbb";
        System.out.println("Using String matches method: " + str.matches(".bb"));
        System.out.println("Using Pattern matches method: " + Pattern.matches(".bb", str));

        // capturing groups
        System.out.println(Pattern.matches("(\\w\\d)\\1", "a2a2"));
        System.out.println(Pattern.matches("(\\w\\d)\\1", "a2b2"));  // Backreference
        System.out.println(Pattern.matches("(AB)(B\\d)\\2\\1", "ABB2B2AB"));
        System.out.println(Pattern.matches("(AB)(B\\d)\\2\\1", "ABB2B3AB"));  // Backreference
    }
}
