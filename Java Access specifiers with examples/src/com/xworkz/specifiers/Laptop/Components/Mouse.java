package com.xworkz.specifiers.Laptop.Components;

public class Mouse {
    public String mouseCompany;
    private int price;
    String mouseType;

    public Mouse(String mouseCompany, int price, String mouseType){
        this.mouseCompany=mouseCompany;
        this.price=price;
        this.mouseType=mouseType;
    }
    private void click(){
        System.out.println("Clicking in mouse");

    }
    public void scroll(){
        System.out.println("Scrolling in mouse");
        click();
        System.out.println("Mouse Comapny "+this.mouseCompany);
        System.out.println("Mouse Price "+this.price);
        System.out.println("Mouse Type "+this.mouseType);
    }
    void move(){
        System.out.println("Moving mouse");
    }

}
