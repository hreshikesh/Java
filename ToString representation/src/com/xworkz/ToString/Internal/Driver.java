package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 1258;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Driver) {
                Driver driver1 = this;
                Driver driver2 = (Driver) obj;
                if (driver1.name.equals(driver2.name) && driver1.licenseNumber.equals(driver2.licenseNumber)) {
                    System.out.println("Same name and license number");
                    return true;
                }
            }
        }
        return false;
    }

}
