package com.journaldev.access;

public class TestA {

    public static void methodPublic() {
        methodPrivate();
    }

    protected static void methodProtected() {
        methodPrivate();
    }

    static void methodDefault() {
        methodPrivate();
    }

    private static void methodPrivate() {
    }
}
