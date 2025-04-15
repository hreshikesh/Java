package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Language;

public class LocalLanguage extends Language {
    @Override
    public void understand(){
        System.out.println("understanding local language");
    }

    public void speak(){
        System.out.println("Speak local language");
    }
}
