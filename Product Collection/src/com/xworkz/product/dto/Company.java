package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class Company {
    private String companyName;
    private int establishedYear;
    private String companyRevenue;
    private String officeLocation;
    private List<Owner> owners;
}
