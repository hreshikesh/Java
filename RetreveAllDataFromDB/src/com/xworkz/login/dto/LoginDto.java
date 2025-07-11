package com.xworkz.login.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class LoginDto implements Serializable {
    private String name;
    private String email;
    private long mobile;
    private String address;

    public LoginDto(int id, String name, String email, long mobile, String address, Timestamp timeOfRecord) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public LoginDto(){

    }

    public LoginDto(String name, String email, long mobile, String address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }
}
