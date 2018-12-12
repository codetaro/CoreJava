package com.journaldev.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {

    public static void main(String[] args) {
        String data = "I will write this String to File in Java";
        int noOfLines = 10000;

        writeUsingFileWriter(data);
        writeUsingBufferedWriter(data, noOfLines);
        writeUsingFiles(data);
        writeUsingOutputStream(data);

        System.out.println("DONE");
    }

    // use streams when you are dealing with raw data
    private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("tmp/OutputStream.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // use Files class from Java 1.7 to write files, internally uses OutputStream
    private static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("tmp/Files.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // use BufferedWriter when number of write operations are more.
    // It uses internal buffer to reduce real IO operations and saves time
    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("tmp/BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for (int i = noOfLines; i > 0; i--) {
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // use FileWriter when number of write operations are less
    private static void writeUsingFileWriter(String data) {
        File file = new File("tmp/FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
