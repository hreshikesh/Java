package com.xworkz.ToString.Internal;

public class Drone {
    private String brand;
    private String cameraQuality;
    private int price;

    public Drone(String brand, String cameraQuality, int price) {
        this.brand = brand;
        this.cameraQuality = cameraQuality;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drone brand " + this.brand + " cameraQuality " + this.cameraQuality + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 758;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Drone) {
                Drone drone1 = this;
                Drone drone2 = (Drone) obj;
                if (drone1.brand.equals(drone2.brand) && drone1.cameraQuality.equals(drone2.cameraQuality)) {
                    System.out.println("Same brand and camera quality");
                    return true;
                }
            }
        }
        return false;
    }

}
