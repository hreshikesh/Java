package com.xworkz.ToString.Internal;

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
                Money money1 = this;
                Money money2 = (Money) obj;
                if (money1.amount == money2.amount) {
                    System.out.println("Same amount");
                    return true;
                }
            }
        }
        return false;
    }

}
