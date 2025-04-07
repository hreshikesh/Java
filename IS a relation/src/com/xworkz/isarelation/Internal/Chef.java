package com.xworkz.isarelation.Internal;

public class Chef extends Restaurant {
    public Chef() {
        System.out.println("Running no-arg constructor of Chef");
    }
    @Override
    public void takeOrder() {
        System.out.println("Restaurant is taking orders in subclass");
    }
    @Override
    public void serveFood() {
        System.out.println("Restaurant is serving food in subclass");
    }
    @Override
    public void prepareBill() {
        System.out.println("Restaurant is preparing bills in subclass");
    }
    @Override
    public void cleanTables() {
        System.out.println("Restaurant is cleaning tables in subclass");
    }
    @Override
    public void manageStaff() {
        System.out.println("Restaurant is managing staff in subclass");
    }

    public void cookChicken(){
        System.out.println("Running cookChicken in Restaurant");
    }

}
