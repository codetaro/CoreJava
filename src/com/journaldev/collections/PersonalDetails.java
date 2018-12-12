package com.journaldev.collections;

import java.time.LocalDate;

public class PersonalDetails {
    String occupation;
    LocalDate dateOfBirth;
    String city;

    public PersonalDetails(String occupation, LocalDate dateOfBirth, String city) {
        this.occupation = occupation;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
    }

    @Override
    public String toString() {
        return this.occupation + ", from " + this.city;
    }
}
