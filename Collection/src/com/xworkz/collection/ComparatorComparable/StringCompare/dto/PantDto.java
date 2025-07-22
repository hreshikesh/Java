package com.xworkz.collection.ComparatorComparable.StringCompare.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class PantDto {
    private String pantBrand;
    private String pantName;
    private int price;
    private String pantEmail;
    private String phone;
    private LocalDateTime localDateTime;

}
