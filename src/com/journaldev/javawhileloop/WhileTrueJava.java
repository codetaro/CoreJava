package com.journaldev.javawhileloop;

public class WhileTrueJava {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Start Processing");
            // look for a file at specific directory
            // if found then process it, say insert rows into database
            System.out.println("End Processing");

            //  wait for 10 seconds and look again
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted, exit now");
                System.exit(0);
            }
        }
    }
}
