package com.xworkz.specifiers.Mobile.Charger;

public class Charger {
    public String chargerCompany;
    private int price;
    String manufacture;

    public Charger(String chargerCompany, int price, String manufacture){
        this.chargerCompany=chargerCompany;
        this.price=price;
        this.manufacture=manufacture;
    }

    private void sold(){
        System.out.println("Running sold in Charger");
        System.out.println("Price of charger "+this.price);
    }
    void charge(){
        System.out.println("Charging mobile");
        System.out.println("Charging Company "+this.chargerCompany);
        System.out.println("Charger manufacture "+this.manufacture);
    }
    public void time(){
        System.out.println("Running time in charge");
        System.out.println("Invoking private method and variable");
        sold();
    }
}
