package com.journaldev.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayListOfObjectArray {

    public static void main(String[] args) {

        List<Object[]> list = new ArrayList<Object[]>();
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"1", "2", "3", "4"};

        JavaArrayListOfObjectArray aa = new JavaArrayListOfObjectArray();
        JavaArrayListOfObjectArray.A[] arr3 = {aa.new A("AA"), aa.new A("BB")};

        list.add(arr1);
        list.add(arr2);
        list.add(arr3);

        for (Object[] objArr : list) {
            System.out.println(Arrays.toString(objArr));

            for (Object obj : objArr) {
                if (obj instanceof String) {
                    // doSomethingForStringObject();
                } else if (obj instanceof JavaArrayListOfObjectArray.A) {
                    // doSomethingForAObject
                }
            }
        }
    }

    public class A {
        private String name;

        public A(String n) {
            this.name = n;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "A.class::" + this.name;
        }
    }
}
