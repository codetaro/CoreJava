package com.journaldev.java8features;

import java.time.*;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime=" + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime=" + today);

        LocalDateTime specificDate = LocalDateTime.of(
                2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date=" + specificDate);

        LocalDateTime todayBeijing = LocalDateTime.now(ZoneId.of("PRC"));
        System.out.println("Current Date in PRC=" + todayBeijing);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(
                10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970= " + dateFromBase);
    }
}
