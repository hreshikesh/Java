package com.xworkz.tostring.Internal;

public class Driver {
    private String name;
    private String licenseNumber;
    private int experience;

    public Driver(String name, String licenseNumber, int experience) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver name " + this.name + " license number " + this.licenseNumber + " experience " + this.experience + " years";
    }
}
