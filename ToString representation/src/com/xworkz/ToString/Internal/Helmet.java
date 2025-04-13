package com.xworkz.ToString.Internal;

public class Helmet {
    private String brand;
    private String size;
    private String color;

    public Helmet(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helmet brand: " + brand + ", size: " + size + ", color: " + color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Helmet) {
                Helmet helmet = this;
                Helmet helmet1 = (Helmet) obj;
                if (helmet.brand.equals(helmet1.brand) && helmet.size.equals(helmet1.size) && helmet.color.equals(helmet1.color)) {
                    System.out.println("Same brand, size, and color");
                    return true;
                }
            }
        }
        return false;
    }


}
