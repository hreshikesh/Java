package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Mayor {
    private String mayorName;
    private  int age;
    private int timesOfWinning;
    private String mayorPartyNsame;
    private Vehicle vehicle;

}
