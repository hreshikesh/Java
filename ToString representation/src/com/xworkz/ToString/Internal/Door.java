package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 123;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Door) {
                Door door1 = this;
                Door door2 = (Door) obj;
                if (door1.material.equals(door2.material) &&
                        door1.height == door2.height &&
                        door1.price == door2.price) {
                    System.out.println("Same material, height, and price");
                    return true;
                }
            }
        }
        return false;
    }

}
