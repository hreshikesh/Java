package com.xworkz.country.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private String countryName;
    private int populationInCr;
    private List<State> states;

}
