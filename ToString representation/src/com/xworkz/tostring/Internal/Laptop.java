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
                Laptop laptop1 = this;
                Laptop laptop2 = (Laptop) obj;
                if (laptop1.processor.equals(laptop2.processor)) {
                    System.out.println("Same processor");
                    return true;
                }
            }
        }
        return false;
    }
}
