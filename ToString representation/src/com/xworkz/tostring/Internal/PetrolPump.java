package com.xworkz.tostring.Internal;

public class PetrolPump {
    private String location;
    private String fuelType;
    private int pricePerLitre;

    public PetrolPump(String location, String fuelType, int pricePerLitre) {
        this.location = location;
        this.fuelType = fuelType;
        this.pricePerLitre = pricePerLitre;
    }

    @Override
    public String toString() {
        return "PetrolPump location " + this.location + " fuel type " + this.fuelType + " price per litre " + this.pricePerLitre;
    }
}
