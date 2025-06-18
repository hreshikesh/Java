package com.xworkz.carregister.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
    private String userName;
    private String carName;
    private int manufacture;
    private String company;
    private String carType;
    private String showroom;
    private String password;
    private String conform;

   public RegisterDto(){

   }

    public String getConform() {
        return conform;
    }

    public void setConform(String conform) {
        this.conform = conform;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }

    public String getShowroom() {
        return showroom;
    }

    public void setShowroom(String showroom) {
        this.showroom = showroom;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "carName='" + carName + '\'' +
                ", userName='" + userName + '\'' +
                ", manufacture=" + manufacture +
                ", company='" + company + '\'' +
                ", carType='" + carType + '\'' +
                ", showroom='" + showroom + '\'' +
                ", password='" + password + '\'' +
                ", conform='" + conform + '\'' +
                '}';
    }
}
