package com.journaldev.collections;

public class EmployeesTester {
    public static void main(String[] args) {
        Employees emps = new Employees();
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}
