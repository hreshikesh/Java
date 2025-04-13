package com.xworkz.tostring.Internal;

public class Sofa {
    private String material;
    private int seats;
    private int price;

    public Sofa(String material, int seats, int price) {
        this.material = material;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sofa material: " + material + ", seats: " + seats + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return -9;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Sofa) {
                Sofa sofa1 = this;
                Sofa sofa2 = (Sofa) obj;
                if (sofa1.material.equals(sofa2.material) &&
                        sofa1.seats == sofa2.seats &&
                        sofa1.price == sofa2.price) {
                    System.out.println("Same material, seats, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
