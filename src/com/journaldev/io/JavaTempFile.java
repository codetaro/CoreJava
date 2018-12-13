package com.journaldev.io;

import java.io.File;
import java.io.IOException;

public class JavaTempFile {

    public static void main(String[] args) {
        try {
            File tmpFile = File.createTempFile("data",null);
            File newFile = File.createTempFile("text",".temp",new File("tmp"));

            System.out.println(tmpFile.getCanonicalPath());
            System.out.println(newFile.getCanonicalPath());

            // write, read data to temporary file like any normal file

            // delete when application terminates
            tmpFile.deleteOnExit();
            newFile.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
