package com.xworkz.collection.ComparatorComparable.StringCompare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@ToString
public class ShirtDto{
    private String shirtName;
    private String shirtBarnd;
    private String brandEmail;
    private int price;
    private Long phone;
    private LocalDateTime localDateTime;
}
