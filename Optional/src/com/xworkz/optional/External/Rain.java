package com.xworkz.optional.External;

import java.util.Optional;

public class Rain {


    public Optional<Integer> rainAmount(String location){
        if("Bangalore".equalsIgnoreCase(location)){
            return Optional.of(4);//of static method takes the value or ref it cannot be null
        }
    return Optional.empty();//returns a empty ref of optional
    }

}
