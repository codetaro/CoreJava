package com.journaldev.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class JavaGetFileSizeUsingApacheCommonsIO {

    static final String FILE_NAME = "/home/dennisyuan/IdeaProjects/CoreJava/JavaDesignPatterns.pdf";

    public static void main(String[] args) {

        File file = new File(FILE_NAME);
        long fileSize = FileUtils.sizeOf(file);
        System.out.println(fileSize + " bytes");
    }
}
