package com.journaldev.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVScannerExample {

    public static void main(String[] args) throws IOException {
Scanner scanner = new Scanner(new File("tmp/employees.csv"));
Scanner dataScanner = null;
int index = 0;
List<Employee2> empList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            dataScanner = new Scanner(scanner.nextLine());
            dataScanner.useDelimiter(",");
            Employee2 emp = new Employee2();

            while (dataScanner.hasNext()) {
                String data = dataScanner.next();
                if (index == 0)
                    emp.setId(Integer.parseInt(data));
                else if (index == 1)
                    emp.setName(data);
                else if (index == 2)
                    emp.setRole(data);
                else if (index == 3)
                    emp.setSalary(data);
                else
                    System.out.println("invalid data::" + data);

                index++;
            }
            index = 0;
            empList.add(emp);
        }

        scanner.close();

        System.out.println(empList);
    }
}