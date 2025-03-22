package com.xworkz.references;

public class PersonalAssistant {
    String paName;
    int paAge;
    int paSalary;
    int paExperience;
    Security security;


    public PersonalAssistant(String paName, int paAge, int paSalary, int paExperience,Security security){
        this.paName=paName;
        this.paAge=paAge;
        this.paSalary=paSalary;
        this.paExperience=paExperience;
        this.security=security;

    }

    public void paDisplay()
    {
        System.out.println("PA Details");
        System.out.println("PA Name "+this.paName);
        System.out.println("PA Age "+this.paAge);
        System.out.println("PA Salary "+this.paSalary);
        System.out.println("PA Experience "+this.paExperience);
        System.out.println("-------------------------------------");
        if(this.security!=null ){
            this.security.securityDisplay();
        }
        else System.err.println("Pointing to null");

    }

}
