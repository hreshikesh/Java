package com.xworkz.collection.List.Collectionwithdto.dto;

import java.io.Serializable;

public class PgDto implements Serializable {

    private String pgName;
    private String place;
    private int rent;
    private int deposit;
    private String owner;
    private String wardern;
    private String pgType;

    public PgDto() {
    }

    public PgDto(int deposit, String owner, String pgName, String pgType, String place, int rent, String wardern) {
        this.deposit = deposit;
        this.owner = owner;
        this.pgName = pgName;
        this.pgType = pgType;
        this.place = place;
        this.rent = rent;
        this.wardern = wardern;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPgName() {
        return pgName;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
    }

    public String getPgType() {
        return pgType;
    }

    public void setPgType(String pgType) {
        this.pgType = pgType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getWardern() {
        return wardern;
    }

    public void setWardern(String wardern) {
        this.wardern = wardern;
    }
}
