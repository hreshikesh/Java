package com.xworkz.collection.Map.MapToList.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CarDto {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private boolean automatic;
    private int mileage;
    private String color;
    private String segment;
    private int seats;
}
