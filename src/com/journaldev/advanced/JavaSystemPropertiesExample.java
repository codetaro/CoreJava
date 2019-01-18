package com.journaldev.advanced;

import java.util.Properties;
import java.util.Set;

public class JavaSystemPropertiesExample {

    public static void main(String[] args) {

        // get system defined properties
        Properties systemProps = System.getProperties();
        Set<Object> keySet = systemProps.keySet();
        for (Object obj : keySet) {
            String key = (String) obj;
            System.out.println("{" + obj + "=" + systemProps.getProperty(key) + "}");
        }

        // get specific property
        System.out.println(System.getProperty("user.country"));

        // clear property example
        System.clearProperty("user.country");
        System.out.println(System.getProperty("user.country"));  // prints null

        // set system property
        System.setProperty("user.country", "CN");
        System.out.println(System.getProperty("user.country"));  // prints "CN"
    }
}
