package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Experience {
    private int noOfYears;
    private String organization;
    private int salary;
    private String field;
    private Education education;
}
