package com.xworkz.collection.Map.MapToList.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BagDto {
    private String brand;
    private String color;
    private double price;
    private int capacityInLiters;
    private String material;
    private boolean waterproof;
    private String madeIn;
    private double weight;
    private String zipType;
    private String seller;
}
