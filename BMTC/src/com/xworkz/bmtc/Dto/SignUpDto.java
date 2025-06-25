package com.xworkz.bmtc.Dto;

import java.io.Serializable;

public class SignUpDto implements Serializable {
    private String userId;
    private String email;
    private String password;
    private String confirmPassword;

    public SignUpDto(){

    }

    public SignUpDto(String userId, String email, String password, String confirmPassword) {
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.password = password;
        this.userId = userId;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "SignUpDto{" +
                "confirmPassword='" + confirmPassword + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
