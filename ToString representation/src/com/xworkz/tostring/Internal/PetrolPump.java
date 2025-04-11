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
    @Override
    public int hashCode() {
        return -87;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof PetrolPump) {
                PetrolPump p1 = this;
                PetrolPump p2 = (PetrolPump) obj;
                if (p1.location.equals(p2.location)) {
                    System.out.println("Same location");
                    return true;
                }
            }
        }
        return false;
    }

}
