package com.xworkz.tostring.Internal;

public class LunchBox {
    private String brand;
    private int containers;
    private int price;

    public LunchBox(String brand, int containers, int price) {
        this.brand = brand;
        this.containers = containers;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LunchBox brand: " + brand + ", containers: " + containers + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return 258;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof LunchBox) {
                LunchBox lunchBox1 = this;
                LunchBox lunchBox2 = (LunchBox) obj;
                if (lunchBox1.brand.equals(lunchBox2.brand) &&
                        lunchBox1.containers == lunchBox2.containers &&
                        lunchBox1.price == lunchBox2.price) {
                    System.out.println("Same brand, containers, and price");
                    return true;
                }
            }
        }
        return false;
    }

}
