package com.journaldev.io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaFileScanner {

    public static void main(String[] args) throws IOException {

        // read file line by line
        String fileName = "tmp/source.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            System.out.println("Lines: " + scanner.nextLine());
        }
        scanner.close();

        // read CSV files and parse it to object array
        scanner = new Scanner(Paths.get("tmp/source.csv"));
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            // parse line to get Emp object
            Employee emp = parseCSVLine(scanner.next());
            System.out.println(emp.toString());
        }
        scanner.close();

        // read from system input
        System.out.println("Read from system input:");
        scanner = new Scanner(System.in);
        System.out.println("Input first word: " + scanner.next());
    }

    private static Employee parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("\\s*,\\s*");
        String name = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();
        return new Employee(name, age, gender);
    }
}

class Employee {
    private String name;
    private int age;
    private String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name=" + this.name + "::Age=" + this.age + "::Gender=" + this.gender;
    }
}

class Employee2 {

    private int id;
    private String name;
    private String role;
    private String salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nID="+getId()+"::Name"+getName()+"::Role="+getRole()+"::Salary="+getSalary();
    }
}
