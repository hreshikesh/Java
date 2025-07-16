package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Bonus {
    private String bonusType;
    private double bonusAmount;
    private String bonusDate;
    private String givenBy;
    private VariablePay variablePay;

}
