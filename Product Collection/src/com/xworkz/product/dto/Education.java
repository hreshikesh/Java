package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter

public class Education {
    private String degreeName;
    private String usn;
    private String collegeName;
    private double totalMarks;
    private University university;
}
