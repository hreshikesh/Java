package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Department {
    private String departmentName;
    private int yearOfWorking;
    private HeadOfDepartment headOfDepartment;
}
