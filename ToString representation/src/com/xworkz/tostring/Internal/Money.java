package com.xworkz.tostring.Internal;

public class Money {
    private String currencyType;
    private String country;
    private int amount;

    public Money(String currencyType, String country, int amount) {
        this.currencyType = currencyType;
        this.country = country;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Money currency " + this.currencyType + " country " + this.country + " amount " + this.amount;
    }
}
