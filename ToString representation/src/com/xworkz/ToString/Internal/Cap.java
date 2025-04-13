package com.xworkz.ToString.Internal;

public class Cap {
    private String color;
    private String brand;
    private int price;

    public Cap(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cap color: " + color + ", brand: " + brand + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return 550;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Cap) {
                Cap cap1 = this;
                Cap cap2 = (Cap) obj;
                if (cap1.color.equals(cap2.color) &&
                        cap1.brand.equals(cap2.brand) &&
                        cap1.price == cap2.price) {
                    System.out.println("Same color, brand and price");
                    return true;
                }
            }
        }
        return false;
    }



}
