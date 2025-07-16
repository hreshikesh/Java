package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Vehicle {
    private String vehicleType;
    private String vehicleComapny;
    private String vehicleModel;
    private int manufactureYear;

    private Registration registration;
}
