package com.xworkz.tostring.Internal;

public class Mat {
    private String material;
    private String shape;
    private int thickness;

    public Mat(String material, String shape, int thickness) {
        this.material = material;
        this.shape = shape;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Mat material: " + material + ", shape: " + shape + ", thickness: " + thickness + "mm";
    }
}
