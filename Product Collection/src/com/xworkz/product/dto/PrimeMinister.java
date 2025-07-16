package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PrimeMinister {
    private String pmName;
    private int pmAge;
    private int yearOfService;
    private String birthPlace;
    private  Constituency constituency;
}
