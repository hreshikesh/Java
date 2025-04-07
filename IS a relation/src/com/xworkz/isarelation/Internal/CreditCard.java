package com.xworkz.isarelation.Internal;

public class CreditCard extends Card {
    public CreditCard() {
        System.out.println("Running no-arg constructor of CreditCard");
    }
    @Override
    public void swipe() {
        System.out.println("Card is swiped for payment in subclass");
    }
    @Override
    public void insert() {
        System.out.println("Card is inserted for payment in subclass");
    }
    @Override
    public void tap() {
        System.out.println("Card is tapped for contactless paymentin subclass");
    }
    @Override
    public void validate() {
        System.out.println("Card is being validated in subclass");
    }
    @Override
    public void expire() {
        System.out.println("Checking card expiration validate in subclass");
    }

    public void creditScore(){
        System.out.println("Credit Score in CreditCard");
    }
}
