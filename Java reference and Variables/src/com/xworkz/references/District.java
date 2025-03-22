package com.xworkz.references;

public class District {
    String districtName;


    City[] city;


    District(String districtName,City[] city){
        this.districtName=districtName;
        this.city=city;
    }

    void districtDisplay() {
        System.out.println("District Details ");
        System.out.println("District " + this.districtName);
        for (City ref : city) {
            if (ref != null) {
                ref.cityDisplay();
            } else System.err.println("Pointing to null");
        }
    }
}
