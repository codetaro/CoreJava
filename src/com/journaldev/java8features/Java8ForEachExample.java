package com.journaldev.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

    public static void main(String[] args) {

        // creating sample collection
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        // #1.traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        // #2.traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });

        // #3.traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }
}