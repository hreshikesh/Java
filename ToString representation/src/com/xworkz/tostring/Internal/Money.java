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
    @Override
    public int hashCode() {
        return 108;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Money) {
                Money m1 = this;
                Money m2 = (Money) obj;
                if (m1.amount == m2.amount) {
                    System.out.println("Same amount");
                    return true;
                }
            }
        }
        return false;
    }

}
