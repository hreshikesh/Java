package com.xworkz.tostring.Internal;

public class Belt {
    private String material;
    private String size;
    private int price;

    public Belt(String material, String size, int price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Belt material " + this.material + " size " + this.size + " price " + this.price;
    }
}
