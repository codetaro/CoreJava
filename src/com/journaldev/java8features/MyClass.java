package com.journaldev.java8features;

public class MyClass implements Interface1, Interface2 {

    @Override
    public void method1(String str) {

    }

    @Override
    public void method2() {

    }

    // MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String str) {
        System.out.println("MyClass logging::" + str);
        Interface1.print("abc");
    }
}
