package com.xworkz.tostring.Internal;

public class Laptop {
    private String brand;
    private String processor;
    private int price;

    public Laptop(String brand, String processor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop brand " + this.brand + " processor " + this.processor + " Laptop Price " + this.price ;
    }
    @Override
    public int hashCode() {
        return -123;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Laptop) {
                Laptop l1 = this;
                Laptop l2 = (Laptop) obj;
                if (l1.processor.equals(l2.processor)) {
                    System.out.println("Same processor");
                    return true;
                }
            }
        }
        return false;
    }
}
