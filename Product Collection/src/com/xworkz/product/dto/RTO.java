package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class RTO {

    private String rtoName;
    private String rtoPin;
    private String city;
    private int landlineNo;

    private Inspector inspector;

}
