package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Details {
    private String houseColor;
    private String gardernPresent;
    private String hasSwimmingPool;
    private String totalBuildingCost;

    private Address address;
}
