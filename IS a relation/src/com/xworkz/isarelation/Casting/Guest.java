package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.ColdDrink;
import com.xworkz.isarelation.Internal.Sprite;

public class Guest {
    public void serve(ColdDrink coldDrink){
        coldDrink.drink();
        coldDrink.chill();
        coldDrink.flavor();
        coldDrink.fizz();
        coldDrink.sugarContent();
        if(coldDrink instanceof Sprite){
            System.out.println("In Sprite");
            Sprite sprite=(Sprite) coldDrink;
            sprite.openCap();
        }
    }
}
