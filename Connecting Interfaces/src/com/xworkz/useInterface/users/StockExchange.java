package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.MarketRegulator;

public class StockExchange {
    private MarketRegulator obj;

    public StockExchange(MarketRegulator obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.monitorTrade();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}