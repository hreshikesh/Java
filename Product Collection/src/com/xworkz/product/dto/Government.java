package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Government {
    private String partyName;
    private String partTotalMember;
    private String budget;
    private String partyHead;
    private PrimeMinister primeMinister;
}
