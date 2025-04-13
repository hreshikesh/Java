package com.xworkz.tostring.Internal;

public class Shampoo {
    private String brand;
    private int volume;
    private String fragrance;

    public Shampoo(String brand, int volume, String fragrance) {
        this.brand = brand;
        this.volume = volume;
        this.fragrance = fragrance;
    }

    @Override
    public String toString() {
        return "Shampoo brand: " + brand + ", volume: " + volume + "ml, fragrance: " + fragrance;
    }
    @Override
    public int hashCode() {
        return -985585;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Shampoo) {
                Shampoo shampoo = this;
                Shampoo shampoo1 = (Shampoo) obj;
                if (shampoo.brand.equals(shampoo1.brand) && shampoo.volume == shampoo1.volume && shampoo.fragrance.equals(shampoo1.fragrance)) {
                    System.out.println("Same brand, volume, and fragrance");
                    return true;
                }
            }
        }
        return false;
    }

}
