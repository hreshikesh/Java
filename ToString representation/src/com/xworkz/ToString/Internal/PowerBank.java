package com.xworkz.ToString.Internal;

public class PowerBank {
    private String brand;
    private int capacity;
    private int price;

    public PowerBank(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PowerBank brand " + this.brand + " capacity " + this.capacity + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 1875477;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof PowerBank) {
                PowerBank powerBank1 = this;
                PowerBank powerBank2 = (PowerBank) obj;
                if (powerBank1.brand.equals(powerBank2.brand) && powerBank1.capacity == powerBank2.capacity) {
                    System.out.println("Same brand and capacity");
                    return true;
                }
            }
        }
        return false;
    }

}
