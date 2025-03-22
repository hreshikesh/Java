package com.xworkz.references;

public class Company {
    String companyName,companyPlace;
    Company(String companyName,String companyPlace){
        this.companyName=companyName;
        this.companyPlace=companyPlace;
    }

    void companyDisplay(){
        System.out.println("Company Details ");
        System.out.println("Company Name "+this.companyName);
        System.out.println("Company Place "+this.companyPlace);

    }
}
