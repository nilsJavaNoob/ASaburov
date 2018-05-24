package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class Child extends Person {
    private String sertificateNumber;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child(String surName, String givenName, String patronymic, LocalDate dateOfBirth, Address address) {
        super(surName, givenName, patronymic, dateOfBirth, address);
    }

    public String getSertificateNumber() {
        return sertificateNumber;
    }

    public void setSertificateNumber(String sertificateNumber) {
        this.sertificateNumber = sertificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
