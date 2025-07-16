package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Setter
public class Constituency {
    private String constituencyName;
    private String representativeName;
    private String constituencyAre;
    private int noOfVoters;
    private Ward ward;
}
