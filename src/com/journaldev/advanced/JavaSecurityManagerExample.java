package com.journaldev.advanced;

public class JavaSecurityManagerExample {

    public static void main(String[] args) {

        SecurityManager secManager = System.getSecurityManager();
        if (secManager == null)
            System.out.println("SecurityManager is not configured");

        SecurityManager mySecManager = new SecurityManager();
        System.setSecurityManager(mySecManager);
        secManager = System.getSecurityManager();
        if (secManager != null)
            System.out.println("SecurityManager is configured");
    }
}
