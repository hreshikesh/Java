package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -985;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Ruler) {
                Ruler ruler1 = this;
                Ruler ruler2 = (Ruler) obj;
                if (ruler1.length == ruler2.length &&
                        ruler1.material.equals(ruler2.material) &&
                        ruler1.price == ruler2.price) {
                    System.out.println("Same length, material, and price");
                    return true;
                }
            }
        }
        return false;
    }



}
