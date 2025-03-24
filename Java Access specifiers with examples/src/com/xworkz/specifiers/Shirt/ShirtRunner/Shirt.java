package com.xworkz.specifiers.Shirt.ShirtRunner;


public class Shirt {
    public String brand;
    private int price;
    String size;

    Shirt(String brand, int price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    void displayShirtDetails() {
        System.out.println("Shirt Brand: " + this.brand);
        System.out.println("Shirt Size: " + this.size);
        System.out.println("Shirt Price: " + this.price);
    }

    private void washCare() {
        System.out.println("Washing instructions: Use cold water and mild detergent.");
    }
    public void wearShirt() {
        System.out.println("Wearing the shirt...");
        washCare();
    }
}

