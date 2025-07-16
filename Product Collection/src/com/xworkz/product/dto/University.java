package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor@ToString
public class University {
    private String universityname;
    private String location;
    private String universityType;
    private String noOfStudents;
    private President president;
}
