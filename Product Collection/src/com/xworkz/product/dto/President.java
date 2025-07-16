package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class President {
    private String presidentname;
    private int presidentAge;
    private int yerarInPosition;
    private String Qualification;
    private  Designation designation;
}
