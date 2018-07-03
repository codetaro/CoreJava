package com.journaldev.test;

import static com.journaldev.test.A.MAX;
import static com.journaldev.test.A.foo;

public class B {

    public static void main(String[] args) {
        System.out.println(MAX);  // normally ClassA.MAX
        foo();                    // normally ClassA.foo()
    }
}
