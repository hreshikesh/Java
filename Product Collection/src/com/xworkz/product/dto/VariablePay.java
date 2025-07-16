package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class VariablePay {
    private double variableAmount;
    private String variableType;
    private String workingPeriod;
    private String targetAchieved;
    private Tax tax;
}
