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
    @Override
    public int hashCode() {
        return 5500;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Camera) {
                Camera camera1 = this;
                Camera camera2 = (Camera) obj;
                if (camera1.brand.equals(camera2.brand) &&
                        camera1.megapixels == camera2.megapixels &&
                        camera1.hasFlash == camera2.hasFlash) {
                    System.out.println("Same brand, megapixels and hasFlash");
                    return true;
                }
            }
        }
        return false;
    }

}
