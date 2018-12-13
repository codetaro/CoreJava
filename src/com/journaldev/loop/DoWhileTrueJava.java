package com.journaldev.loop;

public class DoWhileTrueJava {

    public static void main(String[] args) throws InterruptedException {
        do {
            System.out.println("Start Processing inside do while loop");
            // look for a file at specific directory
            // if found then process it, say insert rows into database
            System.out.println("End Processing of do while loop");

            Thread.sleep(5 * 1000);
        } while (true);
    }
}
