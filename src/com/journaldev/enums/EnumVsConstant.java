package com.journaldev.enums;

public class EnumVsConstant {

    public static void main(String[] args) {
        benefitsOfEnumOverConstants();
    }

    private static void benefitsOfEnumOverConstants() {
        simpleEnumExample(ThreadStates.START);
        simpleEnumExample(ThreadStates.WAITING);
        simpleEnumExample(ThreadStates.RUNNING);
        simpleEnumExample(ThreadStates.DEAD);
        simpleEnumExample(null);

        simpleConstantsExample(1);
        simpleConstantsExample(2);
        simpleConstantsExample(3);
        simpleConstantsExample(4);
        simpleConstantsExample(5);
    }

    private static void simpleEnumExample(ThreadStates th) {
        if (th == ThreadStates.START) System.out.println("Thread started");
        else if (th == ThreadStates.WAITING) System.out.println("Thread is waiting");
        else if (th == ThreadStates.RUNNING) System.out.println("Thread is running");
        else System.out.println("Thread is dead");
    }

    private static void simpleConstantsExample(int i) {
        if (i == ThreadStatesConstant.START) System.out.println("Thread started");
        else if (i == ThreadStatesConstant.WAITING) System.out.println("Thread is waiting");
        else if (i == ThreadStatesConstant.RUNNING) System.out.println("Thread is running");
        else System.out.println("Thread is dead");
    }
}
