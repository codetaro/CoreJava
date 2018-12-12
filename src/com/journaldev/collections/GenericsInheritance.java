package com.journaldev.collections;

public class GenericsInheritance {
    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();
        obj = str;

        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
//        myClass2 = myClass1;
        obj = myClass1; // MyClass<T> parent is Object
    }

    public static class MyClass<T> {
    }
}
