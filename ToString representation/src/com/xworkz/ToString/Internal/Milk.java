package com.xworkz.ToString.Internal;

public class Milk {
    private String brand;
    private int volume;
    private int price;

    public Milk(String brand, int volume, int price) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk brand: " +  this.brand + ", volume: " +  this.volume + "ml, price: " +  this.price;
    }
    @Override
    public int hashCode() {
        return -785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Milk) {
                Milk milk1 = this;
                Milk milk2 = (Milk) obj;
                if (milk1.brand.equals(milk2.brand) &&
                        milk1.volume == milk2.volume &&
                        milk1.price == milk2.price) {
                    System.out.println("Same brand, volume and price");
                    return true;
                }
            }
        }
        return false;
    }



}
