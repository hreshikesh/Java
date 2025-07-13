package com.xworkz.collection.List.CollectionIterator.dto;

import java.io.Serializable;

public class ShoeDto implements Serializable {
    private String shoeBrand;
    private String shoeType;
    private String shoeSize;
    private String shoeColor;
    private String shoeMaterial;
    private int price;
    private String manufactureLocation;
    private String dealer;
    private String rating;

    public ShoeDto(String dealer, String manufactureLocation, int price, String rating, String shoeBrand, String shoeColor, String shoeMaterial, String shoeSize, String shoeType) {
        this.dealer = dealer;
        this.manufactureLocation = manufactureLocation;
        this.price = price;
        this.rating = rating;
        this.shoeBrand = shoeBrand;
        this.shoeColor = shoeColor;
        this.shoeMaterial = shoeMaterial;
        this.shoeSize = shoeSize;
        this.shoeType = shoeType;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getManufactureLocation() {
        return manufactureLocation;
    }

    public void setManufactureLocation(String manufactureLocation) {
        this.manufactureLocation = manufactureLocation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public String getShoeMaterial() {
        return shoeMaterial;
    }

    public void setShoeMaterial(String shoeMaterial) {
        this.shoeMaterial = shoeMaterial;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    @Override
    public String toString() {
        return "ShoeDto{" +
                "dealer='" + dealer + '\'' +
                ", shoeBrand='" + shoeBrand + '\'' +
                ", shoeType='" + shoeType + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                ", shoeColor='" + shoeColor + '\'' +
                ", shoeMaterial='" + shoeMaterial + '\'' +
                ", price=" + price +
                ", manufactureLocation='" + manufactureLocation + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
