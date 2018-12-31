package com.journaldev.java7features;

public class Java7MultipleExceptions {

    public static void main(String[] args) {
        try {
            rethrow("abc");
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void rethrow(String s) throws FirstException, SecondException, ThirdException {
        try {
            if (s.equals("First")) throw new FirstException("First");
            else if (s.equals("Second")) throw new SecondException("Second");
            else throw new ThirdException("Third");
        } catch (Exception e) {
            throw e;
        }
    }

    static class FirstException extends Exception {
        public FirstException(String msg) {
            super(msg);
        }
    }

    static class SecondException extends Exception {
        public SecondException(String msg) {
            super(msg);
        }
    }

    static class ThirdException extends Exception {
        public ThirdException(String msg) {
            super(msg);
        }
    }
}
