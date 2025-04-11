package com.xworkz.tostring.Internal;

public class Adapter {


    private String brand;
    private int wattage;
    private int price;

    public Adapter(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Adapter brand: " + this.brand + ", wattage: " + this.wattage + "W, price: " + this.price;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            {
                if (obj instanceof Adapter) {
                    Adapter adapter1 = this;
                    Adapter adapter2 = (Adapter) obj;
                    if (adapter1.brand.equals(adapter2.brand)) {
                        System.out.println("Same brand");
                        return true;
                    }

                }
            }
        }
        return false;
    }
}


