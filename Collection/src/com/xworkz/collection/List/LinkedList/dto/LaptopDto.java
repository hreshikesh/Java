package com.xworkz.collection.List.LinkedList.dto;

import java.io.Serializable;

public class LaptopDto implements Serializable {
    private String laptopName;
    private int cost;
    private String brand;

    public LaptopDto(){

    }

    public LaptopDto(String laptopName, int cost, String brand) {
        this.laptopName = laptopName;
        this.cost = cost;
        this.brand = brand;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
