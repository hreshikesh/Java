package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tax {
    private String taxType;
    private String taxOffice;
    private String taxOfficeLocation;
    private int taxAmount;
    private Government govrement;
}
