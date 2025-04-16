package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.WeldingRules;

public class Welder implements WeldingRules {
    @Override
    public void weld() {
        System.out.println("Welder is welding");
    }

    @Override
    public void cut() {
        System.out.println("Welder is cutting");
    }

    @Override
    public void grind() {
        System.out.println("Welder is grinding");
    }
}
