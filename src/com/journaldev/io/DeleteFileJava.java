package com.journaldev.io;

import java.io.File;

public class DeleteFileJava {

    public static void main(String[] args) {

        // absolute file name with path
        File file = new File("/home/dennisyuan/file.txt");
        if (file.delete()) {
            System.out.println("/home/dennisyuan/file.txt File deleted");
        } else {
            System.out.println("File /home/dennisyuan/file.txt doesn't exists");
        }

        // file name only
        file = new File("file.txt");
        if (file.delete()) {
            System.out.println("file.txt File deleted from Project root directory");
        } else {
            System.out.println("File file.txt doesn't exists in project root directory");
        }

        // relative path
        file = new File("tmp/file.txt");
        if (file.delete()) {
            System.out.println("tmp/file.txt File deleted from Project root directory");
        } else {
            System.out.println("File tmp/file.txt doesn't exists in project root directory");
        }

        // delete empty directory
        file = new File("tmp");
        if (file.delete()) {
            System.out.println("tmp directory deleted from Project root directory");
        } else {
            System.out.println("tmp directory doesn't exists or not empty in project root directory");
        }

        // try to delete directory with files
        file = new File("/home/dennisyuan/IdeaProjects/CoreJava");
        if (file.delete()) {
            System.out.println("/home/dennisyuan/IdeaProjects/CoreJava directory deleted " +
                    "from Project root directory");
        } else {
            System.out.println("/home/dennisyuan/IdeaProjects/CoreJava directory doesn't " +
                    "exists or not empty");
        }

    }
}
