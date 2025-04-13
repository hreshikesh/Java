package com.xworkz.tostring.Internal;

public class Tripod {
    private String material;
    private int maxHeight;
    private int price;

    public Tripod(String material, int maxHeight, int price) {
        this.material = material;
        this.maxHeight = maxHeight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tripod material: " + material + ", max height: " + maxHeight + "cm, price: " + price;
    }
    @Override
    public int hashCode() {
        return -918585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Tripod) {
                Tripod tripod1 = this;
                Tripod tripod2 = (Tripod) obj;
                if (tripod1.material.equals(tripod2.material) &&
                        tripod1.maxHeight == tripod2.maxHeight &&
                        tripod1.price == tripod2.price) {
                    System.out.println("Same material, max height, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
