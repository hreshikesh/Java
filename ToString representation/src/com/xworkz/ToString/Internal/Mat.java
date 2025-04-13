package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -7;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mat) {
                Mat mat1 = this;
                Mat mat2 = (Mat) obj;
                if (mat1.material.equals(mat2.material) &&
                        mat1.shape.equals(mat2.shape) &&
                        mat1.thickness == mat2.thickness) {
                    System.out.println("Same material, shape and thickness");
                    return true;
                }
            }
        }
        return false;
    }


}
