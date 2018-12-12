package com.journaldev.io;

import java.io.*;

public class InputStreamToFile {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("tmp/witcher.txt");
            OutputStream os = new FileOutputStream("tmp/witcher.bak");

            byte[] buffer = new byte[1024];
            int bytesRead;
            // read from is to buffer
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            // flush os to write any buffered data to file
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
