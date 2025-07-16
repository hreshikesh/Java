package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Information {
    private String historicPlace;
    private double area;
    private int totalRiver;
    private String population;
    private Mayor mayor;
}
