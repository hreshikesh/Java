package com.xworkz.collection.ComparatorComparable.StringCompare.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BagDto {
    private String bagName;
    private String bagBrand;
    private int bagPrice;
    private String barndEmail;
    private long brandPhone;
    private LocalDateTime localDateTime;

}
