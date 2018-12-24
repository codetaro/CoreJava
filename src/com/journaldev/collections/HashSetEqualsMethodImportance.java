package com.journaldev.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsMethodImportance {

    public static void main(String[] args) {
        Set<Emp> emps = new HashSet<>();
        emps.add(new Emp(1, "Pankaj"));
        emps.add(new Emp(2, "David"));
        emps.add(new Emp(1, "Pankaj"));

        System.out.println(emps);

        Emp e = new Emp(3, "Lisa");
        emps.add(e);
        System.out.println(emps);

        e.setId(1); // set values to make it duplicate
        System.out.println(emps);
        e.setName("Pankaj");
        System.out.println(emps);
    }
}

class Emp {
    private String name;
    private int id;

    public Emp(int i, String n) {
        this.id = i;
        this.name = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Emp)) return false;
        Emp e = (Emp) obj;
        return e.getId() == this.getId() &&
                e.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "{" + id + "," + name + "}";
    }

    /* getter & setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}