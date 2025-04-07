package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Beverage;
import com.xworkz.isarelation.Internal.Tea;

public class Relax {
    public void free(Beverage beverage){
        beverage.prepare();
        beverage.serve();
        beverage.addSugar();
        beverage.stir();
        beverage.drink();
        if(beverage instanceof Tea){
            System.out.println("In Tea");
            Tea tea=(Tea) beverage;
            tea.makeTea();
        }
    }
}
