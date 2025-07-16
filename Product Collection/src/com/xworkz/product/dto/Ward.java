package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Ward {
    private String wardName;
    private String wardNo;
    private int wardPopulation;
    private String wardMember;
}
