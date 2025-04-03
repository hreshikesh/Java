package com.xworkz.isarelation.Internal;

public class Card {
    public Card() {
        System.out.println("Running no-arg constructor of Card");
    }

    public void swipe() {
        System.out.println("Card is swiped for payment");
    }

    public void insert() {
        System.out.println("Card is inserted for payment");
    }

    public void tap() {
        System.out.println("Card is tapped for contactless payment");
    }

    public void validate() {
        System.out.println("Card is being validated");
    }

    public void expire() {
        System.out.println("Checking card expiration date");
    }
}
