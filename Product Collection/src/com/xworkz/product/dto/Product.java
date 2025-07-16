package com.xworkz.product.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Setter
public class Product {
    private String productName;
    private int price;
    private String material;
    private String category;
    private Company company;

}
