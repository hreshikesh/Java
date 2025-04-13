package com.xworkz.tostring.Internal;

public class Mixer {
    private String brand;
    private int jars;
    private int price;

    public Mixer(String brand, int jars, int price) {
        this.brand = brand;
        this.jars = jars;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mixer brand: " + brand + ", jars: " + jars + ", price: " + price;
    }

    public int hashCode() {
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mixer) {
                Mixer mixer1 = this;
                Mixer mixer2 = (Mixer) obj;
                if (mixer1.brand.equals(mixer2.brand) && mixer1.jars == mixer2.jars && mixer1.price == mixer2.price) {
                    System.out.println("Same brand, jars and price");
                    return true;
                }
            }
        }
        return false;
    }


}
