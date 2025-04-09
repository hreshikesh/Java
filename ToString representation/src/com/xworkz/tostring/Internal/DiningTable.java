package com.xworkz.tostring.Internal;

public class DiningTable {
    private String shape;
    private int seats;
    private int price;

    public DiningTable(String shape, int seats, int price) {
        this.shape = shape;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DiningTable shape: " + shape + ", seats: " + seats + ", price: " + price;
    }


}
