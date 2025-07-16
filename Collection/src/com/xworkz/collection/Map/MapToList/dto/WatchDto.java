package com.xworkz.collection.Map.MapToList.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class WatchDto {
    private String brand;
    private String model;
    private double price;
    private String color;
    private String type;
    private boolean waterproof;
    private String material;
    private String origin;
    private int warrantyYears;
    private int year;
}
