package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SalaryExpectation {
    private double salaryAmount;
    private String jobExpectedSalary;
    private String salaryDate;
    private String bankName;
    private Bonus bonus;
}
