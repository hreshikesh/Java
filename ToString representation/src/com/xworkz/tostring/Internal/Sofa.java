package com.xworkz.tostring.Internal;

public class Sofa {
    private String material;
    private int seats;
    private int price;

    public Sofa(String material, int seats, int price) {
        this.material = material;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sofa material: " + material + ", seats: " + seats + ", price: " + price;
    }

    }
