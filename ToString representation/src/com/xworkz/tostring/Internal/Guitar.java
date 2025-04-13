package com.xworkz.tostring.Internal;

public class Guitar {
    private String type;
    private String brand;
    private int price;

    public Guitar(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar type: " + type + ", brand: " + brand + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return -69;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Guitar) {
                Guitar guitar1 = this;
                Guitar guitar2 = (Guitar) obj;
                if (guitar1.type.equals(guitar2.type) &&
                        guitar1.brand.equals(guitar2.brand) &&
                        guitar1.price == guitar2.price) {
                    System.out.println("Same type, brand, and price");
                    return true;
                }
            }
        }
        return false;
    }

}