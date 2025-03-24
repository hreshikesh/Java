package com.xworkz.specifiers.Laptop.LaptopRunner;

public class Laptop {
    public String laptopProcessor;
    private int laptopPrice;
    String ram;

    Laptop(String laptopProcessor,int laptopPrice,String ram){
        this.laptopProcessor=laptopProcessor;
        this.laptopPrice=laptopPrice;
        this.ram=ram;
    }
    void laptopDisplay(){
        System.out.println("LptopProcessor "+this.laptopProcessor);
        System.out.println("Laptop Price "+this.laptopPrice);
        System.out.println("Laptop ram "+this.ram);
    }

}
