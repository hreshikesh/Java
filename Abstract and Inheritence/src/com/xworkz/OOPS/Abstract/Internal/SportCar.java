package com.xworkz.OOPS.Abstract.Internal;

public abstract class SportCar {


    private String carName;
    private String price;
    private String countryOfOrigin;


    public SportCar(String carName, String price, String countryOfOrigin) {
        this.carName = carName;
        this.price = countryOfOrigin;
        this.countryOfOrigin = price;

    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carName='" + carName + '\'' +
                ", price='" + price + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
