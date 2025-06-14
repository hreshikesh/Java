package com.xworkz.general.Dto;

import java.io.Serializable;

public class DeathDto implements Serializable {
    private String name;
    private String cause;
    private String dateTime;
    private int age;
    private String certified;
    private String hospitalName;
    private String mannerofdeath;

    public DeathDto() {
        System.out.println("no-args constructor in DeathDto");
    }

    public DeathDto(String name, String cause, String dateTime, int age, String certified, String hospitalName,
                    String mannerofdeath) {

        this.name = name;
        this.cause = cause;
        this.dateTime = dateTime;
        this.age = age;
        this.certified = certified;
        this.hospitalName = hospitalName;
        this.mannerofdeath = mannerofdeath;
    }

    public int getAge() {
        return age;
    }

    public String getCause() {
        return cause;
    }

    public String getCertified() {
        return certified;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getMannerofdeath() {
        return mannerofdeath;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DeathDto{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", certified='" + certified + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerofdeath='" + mannerofdeath + '\'' +
                '}';
    }
}
