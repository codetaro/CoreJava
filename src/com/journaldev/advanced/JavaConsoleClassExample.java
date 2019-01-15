package com.journaldev.advanced;

import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaConsoleClassExample {

    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            Calendar c = new GregorianCalendar();
            console.printf("Welcome %1$s%n", "Dennis");
            console.printf("Current time is: %1$tm %1$te,%1$tY%n", c);
            console.flush();
        } else {
            // no console is attached when run through Eclipse, background process
            System.out.println("No Console attached");
        }
    }
}
