package com.xworkz.tostring.Internal;

public class Remote {
    private String company;
    private String color;
    private int price;

    public Remote(String company, String color, int price) {
        this.company = company;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Remote company " + this.company + " color " + this.color + " price " + this.price;
    }
}
