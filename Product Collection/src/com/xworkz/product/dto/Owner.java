package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Owner {
    private String ownerName;
    private int age;
    private long mobile;
    private String email;

    private List<House> houses;


}
