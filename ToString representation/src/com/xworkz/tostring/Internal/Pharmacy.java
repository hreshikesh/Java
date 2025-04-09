package com.xworkz.tostring.Internal;

public class Pharmacy {
    private String name;
    private String location;
    private int rating;

   public Pharmacy(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Pharmacy name " + this.name + " location " + this.location + " rating " + this.rating;
    }
}
