package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.BookManagement;

public class PublicLibraryImpl implements BookManagement {
    public void lendBook() {
        System.out.println("PublicLibraryImpl is executing lendBook.");
    }
}