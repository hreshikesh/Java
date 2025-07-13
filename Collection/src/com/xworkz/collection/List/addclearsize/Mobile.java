package com.xworkz.collection.List.addclearsize;

import java.util.Collection;
import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        Collection<String> mobiles = new ArrayList<>();
        mobiles.add("Samsung Galaxy S23");
        mobiles.add("iPhone 14");
        mobiles.add("Google Pixel 7");
        mobiles.add("OnePlus 11");
        mobiles.add("Xiaomi 13 Pro");
        mobiles.add("Oppo Find X5 Pro");
        mobiles.add("Vivo X80 Pro");
        mobiles.add("Sony");
        mobiles.add("Motorola Edge 30 Ultra");
        mobiles.add("Realme GT 2 Pro");
        System.out.println("--Mobiles--" + mobiles);
        System.out.println("Mobiles Size " + mobiles.size());
        mobiles.clear();
        System.out.println("After clear()");
        System.out.println("Mobiles Size " + mobiles.size());
        System.out.println("-------------------------------------------");
        mobiles.add("Nokia G50");
        mobiles.add("Huawei P50 Pro");
        mobiles.add("Asus ROG Phone 6");
        mobiles.add("ZTE Axon 20");
        mobiles.add("Lenovo Legion Phone Duel 2");
        mobiles.add("HTC U12+");
        mobiles.add("BlackBerry Key2");
        mobiles.add("LG Velvet");
        mobiles.add("Google Pixel 10");
        mobiles.add("iphone 17 Air");
        System.out.println("--Mobiles--" + mobiles);
        System.out.println("Mobiles Size " + mobiles.size());


    }
}
