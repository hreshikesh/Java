package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Address {
    private String place;
    private int streeetNo;
    private String colonyName;
    private String landmark;
    private City city;
}
