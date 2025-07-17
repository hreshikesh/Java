package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class University {
    private String universityName;
    private int noOfStudents;
    private Chancellor chancellor;


}
