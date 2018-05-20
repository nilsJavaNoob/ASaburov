package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Person {
    String surName;
    private String givenName;
    protected String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(){
       System.out.println("Person is created");
    }
    //=========getters-setters=============
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronmic) {
        this.patronymic = patronmic;
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
    //========end getters-setters=============
}//class
