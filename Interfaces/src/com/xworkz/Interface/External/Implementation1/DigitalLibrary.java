package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Book;
import com.xworkz.Interface.Internal.Rules.Browser;

public class DigitalLibrary implements Browser,Book {


    @Override
    public void readBook() {
        System.out.println("Reading book from digital library");
    }

    @Override
    public void writeBook() {
        System.out.println("Writing book in digital library");
    }

    @Override
    public void publishBook() {
        System.out.println("Publishing book in digital library");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void refreshBrowser() {
        System.out.println("Refreshing browser");

    }
}
