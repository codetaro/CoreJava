package com.journaldev.io;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JavaOpenFile {

    public static void main(String[] args) throws IOException {

        File file = new File("tmp/witcher.txt");

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) desktop.open(file);

        file = new File("JavaDesignPatterns.pdf");
        if (file.exists()) desktop.open(file);
    }
}
