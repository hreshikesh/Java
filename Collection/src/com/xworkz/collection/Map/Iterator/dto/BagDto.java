package com.xworkz.collection.Map.Iterator.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class BagDto implements Serializable {
    private String brand;
    private String color;
    private double price;
    private String type;
    private double capacityInLitres;
    private String material;
    private String waterproof;
    private int numberOfCompartments;
    private String gender;
    private double weightInKg;
}
