package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Portfolio {
    private String designation;
    private int noOfTimesWinning;
    private Department department;
}
