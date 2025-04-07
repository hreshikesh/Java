package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.English;
import com.xworkz.isarelation.Internal.Language;

public class Translate {
    public void convert(Language language){
        language.write();
        language.talk();
        language.read();
        language.improve();
        language.learn();
        if(language instanceof English){
            System.out.println("In english");
            English english=(English) language;
            english.communicate();
        }

    }
}
