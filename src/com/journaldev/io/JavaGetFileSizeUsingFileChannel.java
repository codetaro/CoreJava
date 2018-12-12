package com.journaldev.io;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaGetFileSizeUsingFileChannel {

    static final String FILE_NAME = "/home/dennisyuan/IdeaProjects/CoreJava/JavaDesignPatterns.pdf";

    public static void main(String[] args) {

        Path filePath = Paths.get(FILE_NAME);
        FileChannel fileChannel;
        try {
            fileChannel = FileChannel.open(filePath);
            long fileSize = fileChannel.size();
            System.out.println(fileSize + " bytes");
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
