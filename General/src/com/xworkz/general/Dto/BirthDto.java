package com.xworkz.general.Dto;

import java.io.Serializable;

public class BirthDto implements Serializable {
    private String birthId;
    private String hospital;
    private String fatherName;
    private String motherName;
    private String datetime;
    private String doctorName;
    private String nurseName;
    private String hospitalType;

    public BirthDto() {
        System.out.println("No-arg constructor called");
    }

    @Override
    public String toString() {
        return "BirthDto{" +
                "BirthId='" + birthId + '\'' +
                ", hospital='" + hospital + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", datetime='" + datetime + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }

    public BirthDto(String birthId, String datetime, String doctorName, String fatherName, String hospital, String hospitalType, String motherName, String nurseName) {
        this.birthId = birthId;
        this.datetime = datetime;
        this.doctorName = doctorName;
        this.fatherName = fatherName;
        this.hospital = hospital;
        this.hospitalType = hospitalType;
        this.motherName = motherName;
        this.nurseName = nurseName;
    }
}
