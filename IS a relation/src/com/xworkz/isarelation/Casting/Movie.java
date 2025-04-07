package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Browser;
import com.xworkz.isarelation.Internal.Chrome;

public class Movie {
    public void watchMovie(Browser browser){
        browser.open();
        browser.close();
        browser.navigate();
        browser.incognitoMode();
        browser.extensions();

        if(browser instanceof Chrome){
            System.out.println("In Chrome");
            Chrome chrome=(Chrome) browser;
            chrome.cache();
        }
    }
}
