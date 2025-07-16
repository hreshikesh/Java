package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class City {
    private String cityName;
    private String state;
    private String CM;
    private  String famousPlace;

    private  Information information;
}
