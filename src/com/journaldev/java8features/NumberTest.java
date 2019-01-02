package com.journaldev.java8features;

import java.util.Comparator;
import java.util.List;

public class NumberTest {

    private static int findSquareOfMaxOdd(List<Integer> numbers) {
        // predicate is functional interface and we are using lambdas to
        // initialize it rather than anonymous inner class
        return numbers.stream()
                .filter(NumberTest::isOdd)
                .filter(NumberTest::isGreaterThan3)
                .filter(NumberTest::isLessThan11)
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i) {
        return i > 3;
    }

    public static boolean isLessThan11(int i) {
        return i < 11;
    }
}
