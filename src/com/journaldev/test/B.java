package com.journaldev.test;

public class B {

    public static void main(String[] args) {
        System.out.println(A.MAX);  // normally ClassA.MAX
        A.foo();                    // normally ClassA.foo()
    }
}
