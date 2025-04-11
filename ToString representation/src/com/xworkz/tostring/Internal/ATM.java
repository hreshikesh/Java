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

    @Override
    public int hashCode() {
        return 101;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof ATM) {
                ATM a1 = this;
                ATM a2 = (ATM) obj;
                if (a1.location.equals(a2.location)) {
                    System.out.println("Same location");
                    return true;
                }
            }
        }
        return false;
    }

}
