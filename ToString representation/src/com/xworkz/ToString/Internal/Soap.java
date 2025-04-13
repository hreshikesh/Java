package com.xworkz.ToString.Internal;

public class Soap {
    private String brand;
    private String type;
    private int price;

    public Soap(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 85;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Soap) {
                Soap soap1 = this;
                Soap soap2 = (Soap) obj;
                if (soap1.brand.equals(soap2.brand) && soap1.type.equals(soap2.type)) {
                    System.out.println("Same brand and type");
                    return false;
                }
            }
        }
        return false;
    }

}
