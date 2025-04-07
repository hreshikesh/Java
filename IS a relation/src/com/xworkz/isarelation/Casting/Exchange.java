package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Currency;
import com.xworkz.isarelation.Internal.Money;

public class Exchange {
    public void give(Money money){
        money.exchange();
        money.value();
        money.store();
        money.transfer();
        money.buyGoods();
        if(money instanceof Currency){
            System.out.println("In Currency");
            Currency currency=(Currency) money;
            currency.fakeMoney();
        }
    }
}
