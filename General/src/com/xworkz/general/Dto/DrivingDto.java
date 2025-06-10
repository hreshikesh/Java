package com.xworkz.general.Dto;

import java.io.Serializable;

public class DrivingDto implements Serializable {
    private String applicantName;
    private String address;
    private String mobile;
    private String appliedDate;
    private String vehicleType;

    public DrivingDto() {
        System.out.println("Default constructor of DrivingDto");
    }

    public DrivingDto(String address, String applicantName, String appliedDate, String mobile, String vehicleType) {
        this.address = address;
        this.applicantName = applicantName;
        this.appliedDate = appliedDate;
        this.mobile = mobile;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "DrivingDto{" +
                "address='" + address + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", appliedDate='" + appliedDate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
