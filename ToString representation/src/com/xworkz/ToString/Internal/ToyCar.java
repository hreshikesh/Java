package com.xworkz.ToString.Internal;

public class ToyCar {
    private String color;
    private String brand;
    private int price;

    public ToyCar(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ToyCar color: " + color + ", brand: " + brand + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return -950;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof ToyCar) {
                ToyCar toyCar1 = this;
                ToyCar toyCar2 = (ToyCar) obj;
                if (toyCar1.color.equals(toyCar2.color) &&
                        toyCar1.brand.equals(toyCar2.brand) &&
                        toyCar1.price == toyCar2.price) {
                    System.out.println("Same color, brand, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
