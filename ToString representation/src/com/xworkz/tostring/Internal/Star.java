package com.xworkz.tostring.Internal;

public class Star {
    private String name;
    private int temperature;
    private int distanceFromEarth;

    public Star(String name, int temperature, int distanceFromEarth) {
        this.name = name;
        this.temperature = temperature;
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Star name: " +  this.name + ", temperature: " +  this.temperature + "K, distance  " +  this.distanceFromEarth + " light years";
    }
    @Override
    public int hashCode() {
        return 4;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Star) {
                Star star1 = this;
                Star star2 = (Star) obj;
                if (star1.name.equals(star2.name) &&
                        star1.temperature == star2.temperature &&
                        star1.distanceFromEarth == star2.distanceFromEarth) {
                    System.out.println("Same name, temperature, and distance from Earth");
                    return true;
                }
            }
        }
        return false;
    }

}