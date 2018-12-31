package com.journaldev.java7features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Java7ResourceManagement {

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("tmp/journaldev.txt"));
                BufferedWriter bw = Files.newBufferedWriter(
                        FileSystems.getDefault().getPath("tmp/journaldev.txt"), Charset.defaultCharset())
        ) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
