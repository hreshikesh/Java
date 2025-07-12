package com.xworkz.optional.Runner;

import com.xworkz.optional.External.Rain;

import java.util.Optional;

public class RainRunner {
    public static void main(String[] args) {
        Rain rain=new Rain();
        Optional<Integer> amount =rain.rainAmount("bangalore");
        if(amount.isPresent()){
            int rainAmount =amount.get();
            System.out.println("Rain amount "+ rainAmount);
        }

    }
}
