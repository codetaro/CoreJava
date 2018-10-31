package com.journaldev.util;

import java.util.Arrays;

public class JavaStringArrayToString {

    public static void main(String[] args) {
        String[] strArr = new String[]{"1", "2", "3"};

        String str = Arrays.toString(strArr);
        System.out.println("Java String array to String = " + str);

        str = convertStringArrayToString(strArr, ",");
        System.out.println("Convert Java String array to String = " + str);
    }

    public static String toString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    private static String convertStringArrayToString(String[] strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str).append(delimiter);
        return sb.substring(0, sb.length() - 1);
    }
}
