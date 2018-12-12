package com.journaldev.io;

import java.io.File;

public class DeleteFolderRecursively {

    public static void main(String[] args) {

        String folder = "/home/dennisyuan/tmp";
        // delete folder recursively
        recursiveDelete(new File(folder));
    }

    private static void recursiveDelete(File file) {

        // to end the recursive loop
        if (!file.exists()) {
            return;
        }

        // if directory, go inside and call recursively
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }

        // call delete to delete files and empty directory
        file.delete();
        System.out.println("Deleted file/folder: " + file.getAbsolutePath());
    }

}
