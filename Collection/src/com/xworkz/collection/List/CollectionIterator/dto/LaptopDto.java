package com.xworkz.collection.List.CollectionIterator.dto;

import java.io.Serializable;

public class LaptopDto implements Serializable {
    private String laptopBrand;
    private String laptopType;
    private int price;
    private String manufactureLocation;
    private String dealer;
    private String processor;
    private String ramSize;
    private String memoryCapacity;
    private String gstPercent;
    private String graphicsCardCapacity;


    public LaptopDto() {
    }

    public LaptopDto(String dealer, String graphicsCardCapacity, String gstPercent, String laptopBrand, String laptopType, String manufactureLocation, String memoryCapacity, int price, String processor, String ramSize) {
        this.dealer = dealer;
        this.graphicsCardCapacity = graphicsCardCapacity;
        this.gstPercent = gstPercent;
        this.laptopBrand = laptopBrand;
        this.laptopType = laptopType;
        this.manufactureLocation = manufactureLocation;
        this.memoryCapacity = memoryCapacity;
        this.price = price;
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getGraphicsCardCapacity() {
        return graphicsCardCapacity;
    }

    public void setGraphicsCardCapacity(String graphicsCardCapacity) {
        this.graphicsCardCapacity = graphicsCardCapacity;
    }

    public String getGstPercent() {
        return gstPercent;
    }

    public void setGstPercent(String gstPercent) {
        this.gstPercent = gstPercent;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public String getManufactureLocation() {
        return manufactureLocation;
    }

    public void setManufactureLocation(String manufactureLocation) {
        this.manufactureLocation = manufactureLocation;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "LaptopDto{" +
                "dealer='" + dealer + '\'' +
                ", laptopBrand='" + laptopBrand + '\'' +
                ", laptopType='" + laptopType + '\'' +
                ", price=" + price +
                ", manufactureLocation='" + manufactureLocation + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", memoryCapacity='" + memoryCapacity + '\'' +
                ", gstPercent='" + gstPercent + '\'' +
                ", graphicsCardCapacity='" + graphicsCardCapacity + '\'' +
                '}';
    }
}
