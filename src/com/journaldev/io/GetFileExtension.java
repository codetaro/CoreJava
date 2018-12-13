package com.journaldev.io;

import java.io.File;

public class GetFileExtension {

    public static void main(String[] args) {

        File file = new File("/home/dennis/loop.txt");
        System.out.println("File extension is: " + getFileExtension(file));

        // file name without extension
        file = new File("/home/dennis/temp");
        System.out.println("File extension is: " + getFileExtension(file));

        // file name with dot
        file = new File("/home/dennis/loop.util.txt");
        System.out.println("File extension is: " + getFileExtension(file));

        // hidden files without extension
        file = new File("/home/dennis/.htaccess");
        System.out.println("File extension is: " + getFileExtension(file));
    }

    private static String getFileExtension(File file) {

        if (file.exists()) {
            String fileName = file.getName();
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
                return fileName.substring(fileName.lastIndexOf(".") + 1);
            else
                return "";

        } else {
            return "File " + file.getName() + " doesn't exist!";
        }
    }
}
