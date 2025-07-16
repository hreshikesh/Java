package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Designation {
    private String designationTitle;
    private String depertment;
    private int  levelOfDesignation;
    private String officeLocation;
    private Role role;
}
