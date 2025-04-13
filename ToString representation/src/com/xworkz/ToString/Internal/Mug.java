package com.xworkz.ToString.Internal;

public class Mug {
    private String material;
    private String color;
    private int price;

    public Mug(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mug material: " + material + ", color: " + color + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return -1111;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mug) {
                Mug mug1 = this;
                Mug mug2 = (Mug) obj;
                if (mug1.material.equals(mug2.material) &&
                        mug1.color.equals(mug2.color) &&
                        mug1.price == mug2.price) {
                    System.out.println("Same material, color and price");
                    return true;
                }
            }
        }
        return false;
    }

}