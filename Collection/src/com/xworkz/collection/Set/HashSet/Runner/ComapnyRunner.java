package com.xworkz.collection.Set.HashSet.Runner;

import com.xworkz.collection.Set.HashSet.dto.CompanyDto;

import java.util.HashSet;
import java.util.Set;

public class ComapnyRunner {
    public static void main(String[] args) {

        // to avoid set taking duplicate we override equals to and hash code
        Set<CompanyDto> companyDtos=new HashSet<>();
        companyDtos.add(new CompanyDto("Google","Banglore","Sunder"));
        companyDtos.add(new CompanyDto("Microsoft","Kasargod","Satya"));
        companyDtos.add(new CompanyDto("Oracle","Delhi","Akshatah"));
        companyDtos.add(new CompanyDto("Kambala","Manglore","Deeraj"));

        companyDtos.forEach(t-> System.out.println("Camonay Details "+t));





    }
}
