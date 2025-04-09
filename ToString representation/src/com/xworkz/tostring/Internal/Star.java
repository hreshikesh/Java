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
}