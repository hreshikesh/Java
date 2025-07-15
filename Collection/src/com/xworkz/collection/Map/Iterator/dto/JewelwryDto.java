package com.xworkz.collection.Map.Iterator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@ToString
public class JewelwryDto implements Serializable {
    private  String jewwelMaterial;
    private String jewelType;
    private int price;
    private String shopNmae;
    private  String carat;
}
