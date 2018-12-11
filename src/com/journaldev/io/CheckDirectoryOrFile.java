package com.journaldev.io;

import java.io.File;

public class CheckDirectoryOrFile {

    public static void main(String[] args) {
        File file = new File("/home/dennis/source.txt");
        File dir = new File("/home/dennis");
        File notExists = new File("/home/dennis/notafile");

        System.out.println("/home/dennis/source.txt is file? " + file.isFile());
        System.out.println("/home/dennis/source.txt is directory? " + file.isDirectory());

        System.out.println("/home/dennis is file? " + dir.isFile());
        System.out.println("/home/dennis is directory? " + dir.isDirectory());

        System.out.println("/home/dennis/notafile is file? " + notExists.isFile());
        System.out.println("/home/dennis/notafile is directory? " + notExists.isDirectory());
    }
}
