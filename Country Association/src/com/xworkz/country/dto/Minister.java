package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Minister {
    private String ministerName;
    private String ministerParty;
    private List<Portfolio> portfolios;
}
