package com.xworkz.references;

public class City {
    String cityName;
    Ward[] wards;  // Change to array

    City(String cityName, Ward[] wards){
        this.cityName = cityName;
        this.wards = wards;
    }

    public void cityDisplay() {
        System.out.println("City Details:");
        System.out.println("City Name: " + this.cityName);
        for (Ward ref : wards) { // Looping through array
            if (ref != null) {
                ref.wardDisplay();
            } else {
                System.err.println("Pointing to null");
            }
        }
    }
}
