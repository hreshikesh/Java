package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Card;
import com.xworkz.isarelation.Internal.CreditCard;

public class FiCard {
    public void details(Card card){
        card.swipe();
        card.insert();
        card.tap();
        card.validate();
        card.expire();
        if(card instanceof CreditCard){
            System.out.println("In creditCard");
            CreditCard creditCard=(CreditCard) card;
            creditCard.creditScore();

        }

    }
}
