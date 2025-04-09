package com.xworkz.tostring.Internal;

public class ATM {
    private String bankName;
    private String location;
    private int atmId;

    public ATM(String bankName, String location, int atmId) {
        this.bankName = bankName;
        this.location = location;
        this.atmId = atmId;
    }

    @Override
    public String toString() {
        return "ATM bank " + this.bankName + " location " + this.location + " ATM ID " + this.atmId;
    }
}
