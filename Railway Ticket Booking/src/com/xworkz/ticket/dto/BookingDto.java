package com.xworkz.ticket.dto;

import java.io.Serializable;

public class BookingDto implements Serializable {
    private String name;
    private int age;
    private String source;
    private String destination;
    private String date;
    private String noOfPassenger;
    private String coach;
    private String idProof;
    private String idNo;

    public BookingDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(String noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
