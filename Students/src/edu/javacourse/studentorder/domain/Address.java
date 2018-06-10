package edu.javacourse.studentorder.domain;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class Address {
    private String postCode;
    private String street;
    private String building;

    public Address(String postCode, String street, String building, String extension, String appartment) {
        this.postCode = postCode;
        this.street = street;
        this.building = building;
        this.extension = extension;
        this.appartment = appartment;
    }

    private String extension;
    private String appartment;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }
}//class
