package com.xworkz.relation;

public class Warranty {

    private String startDate;
    private String endDate;

    Warranty(String startDate,String endDate){
        this.startDate=startDate;
        this.endDate=endDate;
    }

    void claim(){
        System.out.println("Running Warranty");
        System.out.println("Warranty start date "+this.startDate);
        System.out.println("Warranty end date "+this.endDate);
    }
}
