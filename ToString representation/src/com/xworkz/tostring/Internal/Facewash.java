package com.xworkz.tostring.Internal;

public class Facewash {
    private String brand;
    private int volume;
    private int price;

    public Facewash(String brand, int volume, int price) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facewash brand: " + brand + ", volume: " + volume + "ml, price: " + price;
    }
    @Override
    public int hashCode() {
        return 789;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Facewash) {
                Facewash facewash1 = this;
                Facewash facewash2 = (Facewash) obj;
                if (facewash1.brand.equals(facewash2.brand) &&
                        facewash1.volume == facewash2.volume &&
                        facewash1.price == facewash2.price) {
                    System.out.println("Same brand, volume, and price");
                    return true;
                }
            }
        }
        return false;
    }
}
