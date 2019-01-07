package com.journaldev.java8features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);

        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date=" + firstDay_2014);

        LocalDate todaySydney = LocalDate.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Current Date in AEDT=" + todaySydney);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= " + dateFromBase);

        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014=" + hundredDay2014);
    }

}
