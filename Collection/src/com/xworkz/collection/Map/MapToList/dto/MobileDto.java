package com.xworkz.collection.Map.MapToList.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
public class MobileDto {
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storage;
    private String os;
    private double screenSize;
    private boolean fiveG;
    private int battery;
    private String madeIn;


}
