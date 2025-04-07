package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Java;
import com.xworkz.isarelation.Internal.ProgrammingLanguage;

public class WebApp {
    public void website(ProgrammingLanguage programmingLanguage){
        programmingLanguage.code();
        programmingLanguage.error();
        programmingLanguage.compile();
        programmingLanguage.run();
        programmingLanguage.debug();
        if(programmingLanguage instanceof Java){
            System.out.println("in Java");
            Java java =(Java) programmingLanguage;
            java.implement();
        }
    }
}
