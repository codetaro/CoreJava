package com.journaldev.io;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class JavaCopyFile {

    public static void main(String[] args) throws InterruptedException, IOException {

        // copy file conventional way using Stream
        File source = new File("tmp/source.avi");
        File dest = new File("tmp/dest.avi");
        long start = System.nanoTime();
        copyFileUsingStream(source, dest);
        System.out.println("Time taken by Stream Copy = " + (System.nanoTime() - start));

        // copy file using java.nio FileChannel
        source = new File("tmp/sourceChannel.avi");
        dest = new File("tmp/destChannel.avi");
        start = System.nanoTime();
        copyFileUsingChannel(source, dest);
        System.out.println("Time taken by Channel Copy = " + (System.nanoTime() - start));

        // copy file using apache commons io
        source = new File("tmp/sourceApache.avi");
        dest = new File("tmp/destApache.avi");
        start = System.nanoTime();
        copyFileUsingApacheCommonsIO(source, dest);
        System.out.println("Time taken by Apache Commons IO Copy = " + (System.nanoTime() - start));

        // using Java 7 Files class
        source = new File("tmp/sourceJava7.avi");
        dest = new File("tmp/destJava7.avi");
        start = System.nanoTime();
        copyFileUsingJava7Files(source, dest);
        System.out.println("Time taken by Java7 Files Copy = " + (System.nanoTime() - start));
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
    }

    private static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}
