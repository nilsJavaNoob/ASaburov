package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class Person {
    private String surName;
    private String givenName;
    private String patronmic;
    private LocalDate dateOfBirth;
    private Address address;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronmic() {
        return patronmic;
    }

    public void setPatronmic(String patronmic) {
        this.patronmic = patronmic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}//class
