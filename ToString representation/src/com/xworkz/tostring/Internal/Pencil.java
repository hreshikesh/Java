package com.xworkz.tostring.Internal;

public class Pencil {
    private String brand;
    private String type; // e.g., HB, 2B, etc.
    private int price;

    public Pencil(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 78;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Pencil) {
                Pencil pencil1 = this;
                Pencil pencil2 = (Pencil) obj;
                if (pencil1.brand.equals(pencil2.brand) && pencil1.type.equals(pencil2.type)) {
                    System.out.println("Same brand and type");
                    return true;
                }
            }
        }
        return false;
    }

}
