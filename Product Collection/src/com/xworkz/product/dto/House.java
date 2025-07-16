package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class House {
    private String houseName;
    private int noOfFloor;
    private String houseType;
    private int totalArea;
    private Details details;
}
