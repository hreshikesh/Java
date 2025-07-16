package com.xworkz.collection.Map.MapToList.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class LaptopDto {
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storage;
    private String processor;
    private String os;
    private double weight;
    private boolean touchScreen;
    private String madeIn;
}
