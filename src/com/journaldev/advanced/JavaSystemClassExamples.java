package com.journaldev.advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaSystemClassExamples {

    public static void main(String[] args) {

        // Get current time
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis);
        System.out.println("Current time in millis=" + currentTimeMillis);
        System.out.println(date);

        long nanoTime = System.nanoTime();
        System.out.println("Current nano time=" + nanoTime);

        // System environment variables
        Map<String, String> envMap = System.getenv();
        Set<String> keySet = envMap.keySet();
        for (String key : keySet) {
            System.out.println("Key=" + key + ",value=" + envMap.get(key));
        }

        String pathValue = System.getenv("PATH");
        System.out.println("$PATH=" + pathValue);

        // File IO operations
        try (FileInputStream fis = new FileInputStream("tmp/input.txt");
             FileOutputStream fos = new FileOutputStream("tmp/server.log");
        ) {
            System.setIn(fis);
            char c = (char) System.in.read();
            System.out.print(c);

            System.setOut(new PrintStream(fos));
            System.out.write("Hi Dennis\n".getBytes());

            System.setErr(new PrintStream(fos));
            System.err.write("Exception message\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
