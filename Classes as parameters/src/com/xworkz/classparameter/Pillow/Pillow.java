package com.xworkz.classparameter.Pillow;
import com.xworkz.classparameter.Mango.Price;

public class Pillow {
    public void getPillowPrice(Price price){
        System.out.println("THe price of Mango");
        if(price!=null){
            price.price(6000);
        }
        else{
            System.out.println("Pointing to null");
        }

    }
}
