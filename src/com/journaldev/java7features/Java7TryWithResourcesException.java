package com.journaldev.java7features;

public class Java7TryWithResourcesException {

    public static void main(String[] args) {
        try {
            tryWithResourceException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            normalTryException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void normalTryException() throws Exception {
        Java7AutoCloseable.MyResource mr = null;
        try {
            mr = new Java7AutoCloseable.MyResource();
            System.out.println("MyResource created in try block");
            if (true) throw new Exception("Exception in try finally");
        } finally {
            if (mr != null) mr.close();
        }
    }

    private static void tryWithResourceException() throws Exception {
        try (Java7AutoCloseable.MyResource mr = new Java7AutoCloseable.MyResource()) {
            System.out.println("MyResource created in try-with-resources");
            if (true) throw new Exception("Exception in try resources");
        }
    }
}
