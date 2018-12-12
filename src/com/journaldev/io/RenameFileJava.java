package com.journaldev.io;

import java.io.File;

public class RenameFileJava {

    public static void main(String[] args) {

        // absolute path rename file
        File file = new File("/home/dennisyuan/javacontinue.txt");
        File newFile = new File("/home/dennisyuan/java1.txt");
        if (file.renameTo(newFile)) {
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failed");
        }

        // relative path rename file
        file = new File("DB.properties");
        newFile = new File("DB_New.properties");
        if (file.renameTo(newFile)) {
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failed");
        }

        // javacontinue move file from one directory to another
        file = new File("/home/dennisyuan/DB.properties");
        newFile = new File("DB_Move.properties");
        if (file.renameTo(newFile)) {
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failed");
        }


        // when source file is not present
        file = new File("/home/dennisyuan/xyz.txt");
        newFile = new File("xyz.properties");
        if (file.renameTo(newFile)) {
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failed");
        }

        // when destination already have a file with same name
        file = new File("/home/dennisyuan/export.sql");
        newFile = new File("/home/dennisyuan/java1.txt");
        if (file.renameTo(newFile)) {
            System.out.println("File rename success");
        } else {
            System.out.println("File rename failed");
        }
    }
}
