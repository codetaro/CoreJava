package com.journaldev.collections;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
