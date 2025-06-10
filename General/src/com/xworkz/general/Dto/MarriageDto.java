package com.xworkz.general.Dto;

import java.io.Serializable;

public class MarriageDto implements Serializable {
    private String groomName;
    private String brideName;
    private String address;
    private String religion;
    private String marriageDate;
    private String witness1;
    private String witness2;


    public MarriageDto() {
        System.out.println("Default constructor called");
    }




    public  MarriageDto(String address, String brideName, String groomName, String marriageDate, String religion, String witness1, String witness2) {
        this.address = address;
        this.brideName = brideName;
        this.groomName = groomName;
        this.marriageDate = marriageDate;
        this.religion = religion;
        this.witness1 = witness1;
        this.witness2 = witness2;
    }


    @Override
    public String toString() {
        return "MarriageDto{" +
                "address='" + address + '\'' +
                ", groomName='" + groomName + '\'' +
                ", brideName='" + brideName + '\'' +
                ", religion='" + religion + '\'' +
                ", marriageDate='" + marriageDate + '\'' +
                ", witness1='" + witness1 + '\'' +
                ", witness2='" + witness2 + '\'' +
                '}';
    }
}



