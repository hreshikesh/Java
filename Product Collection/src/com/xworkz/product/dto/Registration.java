package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class Registration {
    private String rigesterNo;
    private String statePin;
    private String Ownername;
    private String registerDate;

    private RTO rto;
}
