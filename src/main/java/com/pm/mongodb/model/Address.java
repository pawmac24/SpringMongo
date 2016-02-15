package com.pm.mongodb.model;

/**
 * Created by pmackiewicz on 2016-02-11.
 */
public class Address {

    private String postcode;

    private String city;

    private String street;

    private String localNumber;

    public Address(String postcode, String city, String street, String localNumber) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.localNumber = localNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", localNumber='" + localNumber + '\'' +
                '}';
    }
}
