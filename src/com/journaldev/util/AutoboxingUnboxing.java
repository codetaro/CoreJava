package com.journaldev.util;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        int i = 5;
        long j = 105L;

        // passed the int, will get converted to Integer object at Runtime using
        // autoboxing in javacontinue
        doSomething(i);

        List<Long> list = new ArrayList<>();

        // javacontinue autoboxing to add primitive type in collection classes
        list.add(j);
    }

    private static void doSomething(Integer in) {
        // unboxing in javacontinue, at runtime Integer.intValue() is called implicitly to
        // return int
        int j = in;

        // javacontinue unboxing, Integer is passed where int is expected
        doPrimitive(in);
    }

    private static void doPrimitive(int i) {

    }
}
