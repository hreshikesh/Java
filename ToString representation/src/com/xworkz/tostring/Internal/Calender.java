package com.xworkz.tostring.Internal;

public class Calender {
    private String year;
    private String theme;
    private int price;

    public Calender(String year, String theme, int price) {
        this.year = year;
        this.theme = theme;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Calendar year: " +  this.year + ", theme: " +  this.theme + ", price: " +  this.price;
    }
}
