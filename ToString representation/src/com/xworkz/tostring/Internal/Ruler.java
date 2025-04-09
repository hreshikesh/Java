package com.xworkz.tostring.Internal;

public class Ruler {
    private int length;
    private String material;
    private int price;

    public Ruler(int length, String material, int price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ruler length: " + length + "cm, material: " + material + ", price: " + price;
    }


}
