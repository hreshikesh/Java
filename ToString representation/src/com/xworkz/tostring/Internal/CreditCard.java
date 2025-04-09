package com.xworkz.tostring.Internal;

public class CreditCard {
    private String bankName;
    private int cardNumber;
    private int creditLimit;

    public CreditCard(String bankName, int cardNumber, int creditLimit) {
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard bank: " + bankName + ", card number: " + cardNumber + ", credit limit: " + creditLimit;
    }


}
