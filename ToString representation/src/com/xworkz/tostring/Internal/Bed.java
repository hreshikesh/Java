package com.xworkz.tostring.Internal;

public class Bed {
    private String type;
    private String material;
    private int price;

    public Bed(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed type " + this.type + " material " + this.material + " price " + this.price;
    }
}
