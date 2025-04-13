package com.xworkz.tostring.Internal;

public class Chapati {
    private String flourType;
    private int quantity;
    private int price;

    public Chapati(String flourType, int quantity, int price) {
        this.flourType = flourType;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chapati flour type: " +  this.flourType + ", quantity: " +  this.quantity + ", price: " +  this.price;
    }
    @Override
    public int hashCode() {
        return 50054;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Chapati) {
                Chapati chapati1 = this;
                Chapati chapati2 = (Chapati) obj;
                if (chapati1.flourType.equals(chapati2.flourType) &&
                        chapati1.quantity == chapati2.quantity &&
                        chapati1.price == chapati2.price) {
                    System.out.println("Same flourType, quantity, and price");
                    return true;
                }
            }
        }
        return false;
    }
}
