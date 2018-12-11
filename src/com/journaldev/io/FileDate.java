package com.journaldev.io;

import java.io.File;
import java.util.Date;

public class FileDate {

    public static void main(String[] args) {

        File file = new File("JavaDesignPatterns.pdf");
        long timestamp = file.lastModified();
        System.out.println("JavaDesignPatterns.pdf last modified date = " + new Date(timestamp));
    }
}
