package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Education {
    private String degreeName;
    private String collegeName;
    private University university;
}
