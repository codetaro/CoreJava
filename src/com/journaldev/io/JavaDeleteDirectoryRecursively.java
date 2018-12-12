package com.journaldev.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaDeleteDirectoryRecursively {

    public static void main(String[] args) throws IOException {

        Path directory = Paths.get("/home/dennisyuan/log");
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes basicFileAttributes) throws IOException {
                Files.delete(file);  // this will work because it's always a File
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
                Files.delete(dir);  // this will work because Files in the directory are already deleted
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
