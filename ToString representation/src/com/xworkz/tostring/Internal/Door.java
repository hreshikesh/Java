package com.xworkz.tostring.Internal;

public class Door {
    private String material;
    private int height;
    private int price;

    public Door(String material, int height, int price) {
        this.material = material;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door material: " + material + ", height: " + height + "cm, price: " + price;
    }


}
