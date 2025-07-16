package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor
@Setter
@Getter
public class Inspector {
    private String inspectorName;
    private String Department;
    private Long mobileNo;
    private String location;

    private List<Experience> experiences;
}
