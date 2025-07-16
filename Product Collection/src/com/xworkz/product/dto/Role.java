package com.xworkz.product.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Role {
    private String roleName;
    private String skill;
    private int roleBond;
    private String workingMode;

    private List<Criteria> criteria;

}
