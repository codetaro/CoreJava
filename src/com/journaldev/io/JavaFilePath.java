package com.journaldev.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFilePath {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File("/home/dennis/test.txt");
        printPaths(file);

        // relative path
        file = new File("test.xsd");
        printPaths(file);
        // complex relative paths
        file = new File("/home/dennis/../dennis/test.txt");
        printPaths(file);
        // URI paths
        file = new File(new URI("file:///home/dennis/test.txt"));
        printPaths(file);
    }

    private static void printPaths(File file) throws IOException {
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());
        System.out.println();
    }
}
