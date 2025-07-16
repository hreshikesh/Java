package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Criteria {
    private String criteriaName;
    private String target;
    private int noOfDays;
    private String condition;

    private SalaryExpectation salaryExpectation;
}
