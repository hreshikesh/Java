package com.xworkz.collection.List.Collectionwithdto.dto;

import java.io.Serializable;

public class PoliceDto implements Serializable {
    private String policeName;
    private String policeStation;
    private String place;
    private String position;
    private int age;
    private String branch;
    private int Salary;

    public PoliceDto() {
    }
    public PoliceDto(String policeName, String policeStation, String place, String position, int age, String branch, int salary) {
        this.policeName = policeName;
        this.policeStation = policeStation;
        this.place = place;
        this.position = position;
        this.age = age;
        this.branch = branch;
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
