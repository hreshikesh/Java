package com.xworkz.tostring.Internal;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean hasFlash;

    public Camera(String brand, int megapixels, boolean hasFlash) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasFlash = hasFlash;
    }

    @Override
    public String toString() {
        return "Camera brand: " + this. brand + ", megapixels: " +  this.megapixels + "MP, flash: " +  this.hasFlash;
    }
}
