package com.xworkz.general.Dto;

import java.io.Serializable;

public class PassPortDto implements Serializable {
    private String applicantName;
    private long aadar;
    private String address;
    private String pan;
    private String country;
    private String state;
    private String city;
    private int pincode;
    private String passportType;
    private String paymentRef;

    public PassPortDto() {
        System.out.println("no-arg constructor");
    }
    public PassPortDto(String applicantName, long aadar, String address, String pan, String country, String state, String city, int pincode, String passportType, String paymentRef) {
        this.applicantName = applicantName;
        this.aadar = aadar;
        this.address = address;
        this.pan = pan;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.passportType = passportType;
        this.paymentRef = paymentRef;
    }

    public long getAadar() {
        return aadar;
    }

    public String getAddress() {
        return address;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPan() {
        return pan;
    }

    public String getPassportType() {
        return passportType;
    }

    public String getPaymentRef() {
        return paymentRef;
    }

    public int getPincode() {
        return pincode;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "PassPortDto{" +
                "aadar='" + aadar + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", address='" + address + '\'' +
                ", pan='" + pan + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", passportType='" + passportType + '\'' +
                ", paymentRef='" + paymentRef + '\'' +
                '}';
    }
}
