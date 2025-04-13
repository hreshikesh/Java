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
    @Override
    public int hashCode() {
        return 8500;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof CreditCard) {
                CreditCard card1 = this;
                CreditCard card2 = (CreditCard) obj;
                if (card1.bankName.equals(card2.bankName) &&
                        card1.cardNumber == card2.cardNumber &&
                        card1.creditLimit == card2.creditLimit) {
                    System.out.println("Same bankName, cardNumber, and creditLimit");
                    return true;
                }
            }
        }
        return false;
    }

}
