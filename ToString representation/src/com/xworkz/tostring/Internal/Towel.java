package com.xworkz.tostring.Internal;

public class Towel {
    private String material;
    private String color;
    private int length;

    public Towel(String material, String color, int length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Towel material: " + material + ", color: " + color + ", length: " + length;
    }
    @Override
    public int hashCode() {
        return -21;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Towel) {
                Towel Towel1 = this;
                Towel Towel2 = (Towel) obj;
                if (Towel1.material.equals(Towel2.material) &&
                        Towel1.color.equals(Towel2.color) &&
                        Towel1.length == Towel2.length) {
                    System.out.println("Object is not null");
                    return true;
                }
            }
        }
        return false;
    }

}
